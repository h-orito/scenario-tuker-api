package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbParticipateBhv
import dev.wolfort.dbflute.exbhv.DbParticipateRoleBhv
import dev.wolfort.dbflute.exentity.DbParticipate
import dev.wolfort.dbflute.exentity.DbParticipateRole
import dev.wolfort.scenariotuker.domain.model.participate.Participate
import dev.wolfort.scenariotuker.domain.model.participate.ParticipateRepository
import dev.wolfort.scenariotuker.domain.model.participate.Participates
import dev.wolfort.scenariotuker.domain.model.participate.RoleType
import org.springframework.stereotype.Repository

@Repository
class ParticipateRepositoryImpl(
    private val participateBhv: DbParticipateBhv,
    private val participateRoleBhv: DbParticipateRoleBhv
) : ParticipateRepository {

    override fun findAll(): Participates {
        val dbParticipateList = participateBhv.selectList {
            it.query().addOrderBy_DispOrder_Asc()
            it.query().addOrderBy_ParticipateId_Asc()
        }
        participateBhv.loadParticipateRole(dbParticipateList) {}
        return mappingToParticipates(dbParticipateList)
    }

    override fun findById(id: Int): Participate? {
        val optDbParticipate = participateBhv.selectEntity {
            it.query().setParticipateId_Equal(id)
        }
        if (!optDbParticipate.isPresent) return null
        val dbParticipate = optDbParticipate.get()
        participateBhv.loadParticipateRole(dbParticipate) {}
        return mappingToParticipate(dbParticipate)
    }

    override fun findByScenarioId(scenarioId: Int): Participates {
        val dbParticipateList = participateBhv.selectList {
            it.query().setScenarioId_Equal(scenarioId)
            it.query().addOrderBy_DispOrder_Asc()
            it.query().addOrderBy_ParticipateId_Asc()
        }
        participateBhv.loadParticipateRole(dbParticipateList) {}
        return mappingToParticipates(dbParticipateList)
    }

    override fun findByUserId(userId: Int): Participates {
        val dbParticipateList = participateBhv.selectList {
            it.query().setUserId_Equal(userId)
            it.query().addOrderBy_DispOrder_Asc()
            it.query().addOrderBy_ParticipateId_Asc()
        }
        participateBhv.loadParticipateRole(dbParticipateList) {}
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
        participate.roleTypes.forEach { roleType ->
            insertParticipateRole(p.participateId, roleType)
        }
        return findById(p.participateId)!!
    }

    override fun update(participate: Participate): Participate {
        // dispOrderとrollだけ更新
        val p = DbParticipate()
        p.participateId = participate.id
        p.dispOrder = participate.dispOrder
        participateBhv.update(p)
        participateRoleBhv.queryDelete { it.query().setParticipateId_Equal(participate.id) }
        participate.roleTypes.forEach { rollType ->
            insertParticipateRole(participate.id, rollType)
        }
        return findById(participate.id)!!
    }

    override fun delete(id: Int) {
        participateRoleBhv.queryDelete { it.query().setParticipateId_Equal(id) }
        participateBhv.queryDelete { it.query().setParticipateId_Equal(id) }
    }

    private fun insertParticipateRole(participateId: Int?, roleType: RoleType) {
        val r = DbParticipateRole()
        r.participateId = participateId
        r.participateRoleType = roleType.name
        participateRoleBhv.insert(r)
    }

    private fun mappingToParticipates(list: List<DbParticipate>): Participates {
        return Participates(list = list.map { mappingToParticipate(it) })
    }

    private fun mappingToParticipate(participate: DbParticipate): Participate {
        return Participate(
            id = participate.participateId,
            scenarioId = participate.scenarioId,
            userId = participate.userId,
            roleTypes = participate.participateRoleList.map { RoleType.valueOf(it.participateRoleType) },
            dispOrder = participate.dispOrder
        )
    }
}