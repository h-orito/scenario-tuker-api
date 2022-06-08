package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbScenarioBhv
import dev.wolfort.dbflute.exentity.DbScenario
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Repository

@Repository
class ScenarioRepositoryImpl(
    private val scenarioBhv: DbScenarioBhv
) : ScenarioRepository {

    override fun findAll(): Scenarios {
        val dbScenarioList = scenarioBhv.selectList {
            it.query().addOrderBy_ScenarioId_Asc()
        }
        return mappingToScenarios(dbScenarioList)
    }

    override fun findById(id: Int): Scenario? {
        val optDbScenario = scenarioBhv.selectEntity {
            it.query().setScenarioId_Equal(id)
        }
        return optDbScenario.map { mappingToScenario(it) }.orElse(null)
    }

    override fun register(scenario: Scenario): Scenario {
        val s = DbScenario()
        s.scenarioName = scenario.name
        s.scenarioType = scenario.type.name
        s.scenarioLink = scenario.url
        scenarioBhv.insert(s)
        return findById(s.scenarioId)!!
    }

    override fun update(scenario: Scenario): Scenario {
        findById(scenario.id) ?: throw SystemException("scenario not found. id: ${scenario.id}")

        val s = DbScenario()
        s.scenarioId = scenario.id
        s.scenarioName = scenario.name
        s.scenarioType = scenario.type.name
        s.scenarioLink = scenario.url
        scenarioBhv.update(s)
        return findById(scenario.id)!!
    }

    override fun delete(id: Int) {
        scenarioBhv.queryDelete { it.query().setScenarioId_Equal(id) }
    }

    private fun mappingToScenarios(list: List<DbScenario>): Scenarios {
        return Scenarios(list = list.map { mappingToScenario(it) })
    }

    private fun mappingToScenario(scenario: DbScenario): Scenario {
        return Scenario(
            id = scenario.scenarioId,
            name = scenario.scenarioName,
            type = ScenarioType.valueOf(scenario.scenarioType),
            url = scenario.scenarioLink
        )
    }
}