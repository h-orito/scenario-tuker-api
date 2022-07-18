package dev.wolfort.scenariotuker.application.coordinator

import dev.wolfort.scenariotuker.application.service.GameSystemService
import dev.wolfort.scenariotuker.application.service.RuleBookService
import dev.wolfort.scenariotuker.application.service.ScenarioService
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class GameSystemCoordinator(
    private val gameSystemService: GameSystemService,
    private val ruleBookService: RuleBookService,
    private val scenarioService: ScenarioService
) {

    fun integrateDelete(sourceId: Int, destId: Int) {
        // 存在確認
        gameSystemService.findById(sourceId) ?: throw SystemException("source game_system not found. id: $sourceId")
        gameSystemService.findById(destId) ?: throw SystemException("dest game_system not found. id: $sourceId")
        // ルールブックとシナリオのゲームシステムを切り替える
        scenarioService.updateGameSystemId(sourceId, destId)
        ruleBookService.updateGameSystemId(sourceId, destId)
        // 検索用キーワードを移行しつつゲームシステムを削除する
        gameSystemService.integrateDelete(sourceId, destId)
    }
}