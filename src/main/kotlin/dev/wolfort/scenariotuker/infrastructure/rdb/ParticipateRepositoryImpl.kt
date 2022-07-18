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
        val p = DbParticipate()
        p.scenarioId = participate.scenarioId
        p.userId = participate.userId
        p.dispOrder = 0
        participateBhv.insert(p)
        p.dispOrder = p.participateId
        participateBhv.update(p)
        participate.ruleBookIds.forEach { insertParticipateRuleBook(p.participateId, it) }
        participate.roleTypes.forEach { roleType ->
            insertParticipateRole(p.participateId, roleType)
        }
        participate.impression.let {
            if (it?.content.isNullOrBlank()) deleteParticipateImpression(p.participateId)
            else upsertParticipateImpression(p.participateId, it!!)
        }
        return findById(p.participateId)!!
    }

    override fun update(participate: Participate): Participate {
        val p = DbParticipate()
        p.participateId = participate.id
        p.dispOrder = participate.dispOrder
        participateBhv.update(p)
        participateRuleBookBhv.queryDelete { it.query().setParticipateId_Equal(participate.id) }
        participate.ruleBookIds.forEach { insertParticipateRuleBook(participate.id, it) }
        participateRoleBhv.queryDelete { it.query().setParticipateId_Equal(participate.id) }
        participate.roleTypes.forEach { rollType ->
            insertParticipateRole(participate.id, rollType)
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

    private fun insertParticipateRole(participateId: Int, roleType: RoleType) {
        val r = DbParticipateRole()
        r.participateId = participateId
        r.participateRoleType = roleType.name
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
            roleTypes = participate.participateRoleList.map { RoleType.valueOf(it.participateRoleType) },
            dispOrder = participate.dispOrder,
            impression = participate.participateImpressionAsOne.map {
                ParticipateImpression(
                    hasSpoiler = it.hasSpoiler,
                    disclosureRange = DisclosureRange.valueOf(it.disclosureRange),
                    content = it.impression
                )
            }.orElse(null)
        )
    }
}