package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbScenarioAuthorBhv
import dev.wolfort.dbflute.exbhv.DbScenarioBhv
import dev.wolfort.dbflute.exbhv.DbScenarioDictionaryBhv
import dev.wolfort.dbflute.exentity.DbScenario
import dev.wolfort.dbflute.exentity.DbScenarioAuthor
import dev.wolfort.dbflute.exentity.DbScenarioDictionary
import dev.wolfort.scenariotuker.domain.model.scenario.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Repository

@Repository
class ScenarioRepositoryImpl(
    private val scenarioBhv: DbScenarioBhv,
    private val scenarioAuthorBhv: DbScenarioAuthorBhv,
    private val scenarioDictionaryBhv: DbScenarioDictionaryBhv
) : ScenarioRepository {

    override fun findAll(): Scenarios {
        val dbScenarioList = scenarioBhv.selectList {
            it.query().addOrderBy_ScenarioId_Asc()
        }
        scenarioBhv.load(dbScenarioList) {
            it.loadScenarioDictionary {}
            it.loadScenarioAuthor { }
        }
        return mappingToScenarios(dbScenarioList)
    }

    override fun findAllByIds(ids: List<Int>): Scenarios {
        if (ids.isEmpty()) return Scenarios(list = emptyList())
        val dbScenarioList = scenarioBhv.selectList {
            it.query().setScenarioId_InScope(ids)
        }
        scenarioBhv.load(dbScenarioList) {
            it.loadScenarioDictionary {}
            it.loadScenarioAuthor { }
        }
        // リクエスト順に並び替える
        return mappingToScenarios(ids.map { id -> dbScenarioList.first { it.scenarioId == id } })
    }

    override fun search(query: ScenarioQuery): Scenarios {
        val dbScenarioList = scenarioBhv.selectList {
            if (!query.name.isNullOrEmpty()) {
                it.query().setScenarioName_LikeSearch(query.name) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            query.gameSystemId?.let { gameSystemId ->
                it.query().setGameSystemId_Equal(gameSystemId)
            }
            if (!query.gameSystemName.isNullOrEmpty()) {
                it.query().queryGameSystem().setGameSystemName_LikeSearch(query.gameSystemName) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            if (!query.authorName.isNullOrEmpty()) {
                it.query().existsScenarioAuthor { saCB ->
                    saCB.query().queryAuthor().setAuthorName_LikeSearch(query.authorName) { op ->
                        op.splitByBlank().likeContain().asOrSplit()
                    }
                }
            }
            it.query().setScenarioType_Equal(query.type.name)
            it.query().addOrderBy_ScenarioId_Asc()
        }
        scenarioBhv.load(dbScenarioList) {
            it.loadScenarioDictionary {}
            it.loadScenarioAuthor { }
        }
        return mappingToScenarios(dbScenarioList)
    }

    override fun findAllByGameSystemId(gameSystemId: Int): Scenarios {
        val dbScenarioList = scenarioBhv.selectList {
            it.query().setGameSystemId_Equal(gameSystemId)
            it.query().addOrderBy_ScenarioId_Asc()
        }
        scenarioBhv.load(dbScenarioList) {
            it.loadScenarioDictionary {}
            it.loadScenarioAuthor { }
        }
        return mappingToScenarios(dbScenarioList)
    }

    override fun findAllByAuthorId(authorId: Int): Scenarios {
        val dbScenarioList = scenarioBhv.selectList {
            it.query().existsScenarioAuthor { saCB ->
                saCB.query().setAuthorId_Equal(authorId)
            }
            it.query().addOrderBy_ScenarioId_Asc()
        }
        scenarioBhv.load(dbScenarioList) {
            it.loadScenarioDictionary {}
            it.loadScenarioAuthor { }
        }
        return mappingToScenarios(dbScenarioList)
    }

    override fun findById(id: Int): Scenario? {
        val optDbScenario = scenarioBhv.selectEntity {
            it.query().setScenarioId_Equal(id)
        }
        if (!optDbScenario.isPresent) return null
        val dbScenario = optDbScenario.get()
        scenarioBhv.load(dbScenario) {
            it.loadScenarioDictionary {}
            it.loadScenarioAuthor { }
        }
        return mappingToScenario(dbScenario)
    }

    override fun register(scenario: Scenario): Scenario {
        val s = DbScenario()
        s.scenarioName = scenario.name
        s.scenarioType = scenario.type.name
        s.scenarioUrl = scenario.url?.value
        s.gameSystemId = scenario.gameSystemId
        scenarioBhv.insert(s)
        scenario.authorIds.forEach { insertScenarioAuthor(s.scenarioId, it) }
        scenario.dictionaryNames.forEach { insertScenarioDictionary(s.scenarioId, it) }
        return findById(s.scenarioId)!!
    }

    override fun update(scenario: Scenario): Scenario {
        findById(scenario.id) ?: throw SystemException("scenario not found. id: ${scenario.id}")

        val s = DbScenario()
        s.scenarioId = scenario.id
        s.scenarioName = scenario.name
        s.scenarioType = scenario.type.name
        s.scenarioUrl = scenario.url?.value
        s.gameSystemId = scenario.gameSystemId
        scenarioBhv.update(s)

        scenarioAuthorBhv.queryDelete { it.query().setScenarioId_Equal(scenario.id) }
        scenario.authorIds.forEach { insertScenarioAuthor(scenario.id, it) }

        scenarioDictionaryBhv.queryDelete { it.query().setScenarioId_Equal(scenario.id) }
        scenario.dictionaryNames.forEach { insertScenarioDictionary(scenario.id, it) }

        return findById(scenario.id)!!
    }


    private fun insertScenarioAuthor(scenarioId: Int, authorId: Int) {
        val sa = DbScenarioAuthor()
        sa.scenarioId = scenarioId
        sa.authorId = authorId
        scenarioAuthorBhv.insert(sa)
    }

    private fun insertScenarioDictionary(scenarioId: Int, name: String) {
        val d = DbScenarioDictionary()
        d.scenarioId = scenarioId
        d.scenarioName = name
        scenarioDictionaryBhv.insert(d)
    }

    private fun mappingToScenarios(list: List<DbScenario>): Scenarios {
        return Scenarios(list = list.map { mappingToScenario(it) })
    }

    private fun mappingToScenario(scenario: DbScenario): Scenario {
        return Scenario(
            id = scenario.scenarioId,
            name = scenario.scenarioName,
            dictionaryNames = scenario.scenarioDictionaryList.map { it.scenarioName },
            type = ScenarioType.valueOf(scenario.scenarioType),
            url = scenario.scenarioUrl?.let { ScenarioUrl(it) },
            gameSystemId = scenario.gameSystemId,
            authorIds = scenario.scenarioAuthorList.map { it.authorId }
        )
    }
}