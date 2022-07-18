package dev.wolfort.scenariotuker.application.coordinator

import dev.wolfort.scenariotuker.application.service.ParticipateService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.application.service.UserService
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class ScenarioCoordinator(
    private val scenarioService: ScenarioService,
    private val participateService: ParticipateService,
    private val userService: UserService
) {

    fun integrateDelete(sourceId: Int, destId: Int) {
        // 存在確認
        val source =
            scenarioService.findById(sourceId) ?: throw SystemException("source scenario not found. id: $sourceId")
        val dest =
            scenarioService.findById(destId) ?: throw SystemException("dest scenario not found. id: $sourceId")
        // ゲームシステムが同じでないと統合不可
        if (source.gameSystemId != dest.gameSystemId) throw SystemException("ゲームシステムが異なるため統合できません")
        // 参加記録とユーザー所有シナリオのシナリオを切り替える
        participateService.updateScenarioId(sourceId, destId)
        userService.updateUserScenarioId(sourceId, destId)
        // 検索用キーワードと製作者を移行しつつシナリオを削除する
        scenarioService.integrateDelete(sourceId, destId)
    }
}