package dev.wolfort.scenariotuker.application.coordinator

import dev.wolfort.scenariotuker.application.service.ParticipateService
import dev.wolfort.scenariotuker.application.service.RuleBookService
import dev.wolfort.scenariotuker.application.service.UserService
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Service

@Service
class RuleBookCoordinator(
    private val ruleBookService: RuleBookService,
    private val participateService: ParticipateService,
    private val userService: UserService
) {

    fun integrateDelete(sourceId: Int, destId: Int) {
        // 存在確認
        val sourceRuleBook =
            ruleBookService.findById(sourceId) ?: throw SystemException("source rule_book not found. id: $sourceId")
        val destRuleBook =
            ruleBookService.findById(destId) ?: throw SystemException("dest rule_book not found. id: $sourceId")
        // ゲームシステムが同じでないと統合不可
        if (sourceRuleBook.gameSystemId != destRuleBook.gameSystemId) throw SystemException("ゲームシステムが異なるため統合できません")
        // 参加記録とユーザー所有ルールブックのルールブックを切り替える
        participateService.updateRuleBookId(sourceId, destId)
        userService.updateUserRuleBookId(sourceId, destId)
        // 検索用キーワードを移行しつつルールブックを削除する
        ruleBookService.integrateDelete(sourceId, destId)
    }
}