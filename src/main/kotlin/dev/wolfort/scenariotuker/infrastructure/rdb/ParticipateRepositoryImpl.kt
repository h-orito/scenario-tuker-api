package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbParticipateBhv
import dev.wolfort.dbflute.exbhv.DbParticipateImpressionBhv
import dev.wolfort.dbflute.exbhv.DbParticipateRoleBhv
import dev.wolfort.dbflute.exbhv.DbParticipateRuleBookBhv
import dev.wolfort.dbflute.exentity.DbParticipate
import dev.wolfort.dbflute.exentity.DbParticipateImpression
import dev.wolfort.dbflute.exentity.DbParticipateRole
import dev.wolfort.dbflute.exentity.DbParticipateRuleBook
import dev.wolfort.scenariotuker.domain.model.participate.*
import org.springframework.stereotype.Repository

@Repository
class ParticipateRepositoryImpl(
    private val participateBhv: DbParticipateBhv,
    private val participateRoleBhv: DbParticipateRoleBhv,
    private val participateImpressionBhv: DbParticipateImpressionBhv,
    private val participateRuleBookBhv: DbParticipateRuleBookBhv
) : ParticipateRepository {

    override fun findAll(): Participates {
        val dbParticipateList = participateBhv.selectList {
            it.setupSelect_ParticipateImpressionAsOne()
            it.query().addOrderBy_DispOrder_Asc()
            it.query().addOrderBy_ParticipateId_Asc()
        }
        participateBhv.load(dbParticipateList) {
            it.loadParticipateRole { }
            it.loadParticipateRuleBook { }
        }
        return mappingToParticipates(dbParticipateList)
    }

    override fun findById(id: Int): Participate? {
        val optDbParticipate = participateBhv.selectEntity {
            it.setupSelect_ParticipateImpressionAsOne()
            it.query().setParticipateId_Equal(id)
        }
        if (!optDbParticipate.isPresent) return null
        val dbParticipate = optDbParticipate.get()
        participateBhv.load(dbParticipate) {
            it.loadParticipateRole { }
            it.loadParticipateRuleBook { }
        }
        return mappingToParticipate(dbParticipate)
    }

    override fun findAllByScenarioId(scenarioId: Int): Participates {
        val dbParticipateList = participateBhv.selectList {
            it.setupSelect_ParticipateImpressionAsOne()
            it.query().setScenarioId_Equal(scenarioId)
            it.query().addOrderBy_DispOrder_Asc()
            it.query().addOrderBy_ParticipateId_Asc()
        }
        participateBhv.load(dbParticipateList) {
            it.loadParticipateRole { }
            it.loadParticipateRuleBook { }
        }
        return mappingToParticipates(dbParticipateList)
    }

    override fun findAllByRuleBookId(ruleBookId: Int): Participates {
        val dbParticipateList = participateBhv.selectList {
            it.setupSelect_ParticipateImpressionAsOne()
            it.query().existsParticipateRuleBook { prCB ->
                prCB.query().setRuleBookId_Equal(ruleBookId)
            }
            it.query().addOrderBy_DispOrder_Asc()
            it.query().addOrderBy_ParticipateId_Asc()
        }
        participateBhv.load(dbParticipateList) {
            it.loadParticipateRole { }
            it.loadParticipateRuleBook { }
        }
        return mappingToParticipates(dbParticipateList)
    }

    override fun findAllByUserId(userId: Int): Participates {
        val dbParticipateList = participateBhv.selectList {
            it.setupSelect_ParticipateImpressionAsOne()
            it.query().setUserId_Equal(userId)
            it.query().addOrderBy_DispOrder_Asc()
            it.query().addOrderBy_ParticipateId_Asc()
        }
        participateBhv.load(dbParticipateList) {
            it.loadParticipateRole { }
            it.loadParticipateRuleBook { }
        }
        return mappingToParticipates(dbParticipateList)
    }

    override fun register(participate: Participate): Participate {
        val participateId = insertParticipate(participate)
        participate.ruleBookIds.forEach { insertParticipateRuleBook(participateId, it) }
        participate.roleNames.distinct().forEach { roleName ->
            insertParticipateRole(participateId, roleName)
        }
        participate.impression.let {
            if (it?.content.isNullOrBlank()) deleteParticipateImpression(participateId)
            else upsertParticipateImpression(participateId, it!!)
        }
        return findById(participateId)!!
    }


    override fun update(participate: Participate): Participate {
        updateParticipate(participate)
        participateRuleBookBhv.queryDelete { it.query().setParticipateId_Equal(participate.id) }
        participate.ruleBookIds.forEach { insertParticipateRuleBook(participate.id, it) }
        participateRoleBhv.queryDelete { it.query().setParticipateId_Equal(participate.id) }
        participate.roleNames.distinct().forEach { roleName ->
            insertParticipateRole(participate.id, roleName)
        }
        participate.impression.let {
            if (it?.content.isNullOrBlank()) deleteParticipateImpression(participate.id)
            else upsertParticipateImpression(participate.id, it!!)
        }
        return findById(participate.id)!!
    }

    override fun delete(id: Int) {
        deleteParticipateImpression(id)
        participateRuleBookBhv.queryDelete { it.query().setParticipateId_Equal(id) }
        participateRoleBhv.queryDelete { it.query().setParticipateId_Equal(id) }
        participateBhv.queryDelete { it.query().setParticipateId_Equal(id) }
    }

    override fun updateRuleBookId(sourceRuleBookId: Int, destRuleBookId: Int) {
        val participates = findAllByRuleBookId(sourceRuleBookId)
        participates.list.forEach { participate ->
            var ruleBookIds = participate.ruleBookIds
            ruleBookIds = ruleBookIds.filterNot { id -> id == sourceRuleBookId }
            ruleBookIds = ruleBookIds + destRuleBookId
            update(participate.copy(ruleBookIds = ruleBookIds.distinct()))
        }
    }

    override fun updateScenarioId(sourceScenarioId: Int, destScenarioId: Int) {
        val participates = findAllByScenarioId(sourceScenarioId)
        participates.list.forEach { participate ->
            val existing = participateBhv.selectByUniqueOf(destScenarioId, participate.userId)
            if (existing.isPresent) {
                delete(participate.id)
            } else {
                val p = DbParticipate()
                p.participateId = participate.id
                p.scenarioId = destScenarioId
                participateBhv.update(p)
            }
        }
    }

    private fun insertParticipate(participate: Participate): Int {
        val p = DbParticipate()
        p.scenarioId = participate.scenarioId
        p.userId = participate.userId
        p.dispOrder = 0
        participate.term?.let {
            p.participateTermFrom = it.from
            p.participateTermTo = it.to
        }
        p.playerNum = participate.playerNum
        p.gameMaster = participate.gameMaster
        p.playerNames = participate.playerNames
        p.requiredHours = participate.requiredHours
        p.memo = participate.memo
        participateBhv.insert(p)
        p.dispOrder = p.participateId
        participateBhv.update(p)
        return p.participateId
    }

    private fun updateParticipate(participate: Participate) {
        val p = DbParticipate()
        p.participateId = participate.id
        p.dispOrder = participate.dispOrder
        participate.term?.let {
            p.participateTermFrom = it.from
            p.participateTermTo = it.to
        }
        p.playerNum = participate.playerNum
        p.gameMaster = participate.gameMaster
        p.playerNames = participate.playerNames
        p.requiredHours = participate.requiredHours
        p.memo = participate.memo
        participateBhv.update(p)
    }

    private fun insertParticipateRole(participateId: Int, roleName: String) {
        val r = DbParticipateRole()
        r.participateId = participateId
        r.participateRoleName = roleName
        participateRoleBhv.insert(r)
    }

    private fun insertParticipateRuleBook(participateId: Int, ruleBookId: Int) {
        val pr = DbParticipateRuleBook()
        pr.participateId = participateId
        pr.ruleBookId = ruleBookId
        participateRuleBookBhv.insert(pr)
    }

    private fun upsertParticipateImpression(
        participateId: Int,
        impression: ParticipateImpression
    ) {
        val existing = participateImpressionBhv.selectEntity {
            it.query().setParticipateId_Equal(participateId)
        }
        val i = if (existing.isPresent) existing.get() else DbParticipateImpression()
        i.participateId = participateId
        i.hasSpoiler = impression.hasSpoiler
        i.disclosureRange = impression.disclosureRange.name
        i.impression = impression.content
        participateImpressionBhv.insertOrUpdate(i)
    }

    private fun deleteParticipateImpression(participateId: Int) {
        participateImpressionBhv.queryDelete {
            it.query().setParticipateId_Equal(participateId)
        }
    }

    private fun mappingToParticipates(list: List<DbParticipate>): Participates {
        return Participates(list = list.map { mappingToParticipate(it) })
    }

    private fun mappingToParticipate(participate: DbParticipate): Participate {
        return Participate(
            id = participate.participateId,
            scenarioId = participate.scenarioId,
            userId = participate.userId,
            ruleBookIds = participate.participateRuleBookList.map { it.ruleBookId },
            roleNames = participate.participateRoleList.map { it.participateRoleName },
            dispOrder = participate.dispOrder,
            impression = participate.participateImpressionAsOne.map {
                ParticipateImpression(
                    hasSpoiler = it.hasSpoiler,
                    disclosureRange = DisclosureRange.valueOf(it.disclosureRange),
                    content = it.impression
                )
            }.orElse(null),
            term =
            if (participate.participateTermFrom == null && participate.participateTermTo == null) null
            else ParticipateTerm(
                from = participate.participateTermFrom,
                to = participate.participateTermTo
            ),
            playerNum = participate.playerNum,
            gameMaster = participate.gameMaster,
            playerNames = participate.playerNames,
            requiredHours = participate.requiredHours,
            memo = participate.memo
        )
    }
}