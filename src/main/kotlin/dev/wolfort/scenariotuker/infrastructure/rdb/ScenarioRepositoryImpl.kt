package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.cbean.DbScenarioCB
import dev.wolfort.dbflute.exbhv.DbScenarioAuthorBhv
import dev.wolfort.dbflute.exbhv.DbScenarioBhv
import dev.wolfort.dbflute.exbhv.DbScenarioDictionaryBhv
import dev.wolfort.dbflute.exentity.DbScenario
import dev.wolfort.dbflute.exentity.DbScenarioAuthor
import dev.wolfort.dbflute.exentity.DbScenarioDictionary
import dev.wolfort.scenariotuker.domain.model.scenario.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.dbflute.bhv.readable.CBCall
import org.dbflute.cbean.result.PagingResultBean
import org.springframework.stereotype.Repository

@Repository
class ScenarioRepositoryImpl(
    private val scenarioBhv: DbScenarioBhv,
    private val scenarioAuthorBhv: DbScenarioAuthorBhv,
    private val scenarioDictionaryBhv: DbScenarioDictionaryBhv
) : ScenarioRepository {

    override fun findAll(): Scenarios {
        return selectList {
            it.paging(100000, 1)
            it.query().addOrderBy_ScenarioId_Asc()
        }
    }

    override fun findAllByIds(ids: List<Int>): Scenarios {
        if (ids.isEmpty()) return Scenarios.ofEmpty()
        val scenarios = selectList {
            it.paging(100000, 1)
            it.query().setScenarioId_InScope(ids)
        }
        // リクエスト順に並び替える
        return scenarios.copy(
            list = ids.map { id -> scenarios.list.first { it.id == id } }
        )
    }

    override fun search(query: ScenarioQuery): Scenarios {
        return selectList {
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
            query.type?.let { type ->
                it.query().setScenarioType_Equal(type.name)
            }
            if (!query.authorName.isNullOrEmpty()) {
                it.query().existsScenarioAuthor { saCB ->
                    saCB.query().queryAuthor().setAuthorName_LikeSearch(query.authorName) { op ->
                        op.splitByBlank().likeContain().asOrSplit()
                    }
                }
            }
            query.playerNum?.let { playerNum ->
                if (query.playerNumEmpty == true) {
                    it.orScopeQuery { orCB ->
                        orCB.query().setPlayerNumMin_LessEqual(playerNum)
                        orCB.query().setPlayerNumMin_IsNull()
                    }
                    it.orScopeQuery { orCB ->
                        orCB.query().setPlayerNumMax_GreaterEqual(playerNum)
                        orCB.query().setPlayerNumMax_IsNull()
                    }
                } else {
                    it.query().setPlayerNumMin_LessEqual(playerNum)
                    it.query().setPlayerNumMax_GreaterEqual(playerNum)
                }
            }
            if (query.paging != null) {
                it.paging(query.paging.pageSize, query.paging.pageCount)
            } else {
                it.paging(100000, 1)
            }
            it.query().addOrderBy_ScenarioId_Asc()
        }
    }

    override fun findAllByGameSystemId(gameSystemId: Int): Scenarios {
        return selectList {
            it.paging(100000, 1)
            it.query().setGameSystemId_Equal(gameSystemId)
            it.query().addOrderBy_ScenarioId_Asc()
        }
    }

    override fun findAllByAuthorId(authorId: Int): Scenarios {
        return selectList {
            it.query().existsScenarioAuthor { saCB ->
                saCB.query().setAuthorId_Equal(authorId)
            }
            it.paging(100000, 1)
            it.query().addOrderBy_ScenarioId_Asc()
        }
    }

    override fun findAllByUserId(userId: Int): Scenarios {
        return selectList {
            it.query().existsUserScenario { usCB ->
                usCB.query().setUserId_Equal(userId)
            }
            it.paging(100000, 1)
            it.query().addOrderBy_ScenarioId_Asc()
        }
    }

    override fun findPopularScenarios(type: ScenarioType, count: Int): Scenarios {
        return selectList {
            it.specify().derivedParticipate().count({ pCB ->
                pCB.specify().columnParticipateId()
                pCB.query().queryUser().setIsDeleted_Equal(false)
            }, DbScenario.ALIAS_participateCount)
            it.query().setScenarioType_Equal(type.name)
            // 参加数が多い順
            it.query().addSpecifiedDerivedOrderBy_Desc(DbScenario.ALIAS_participateCount)
            it.fetchFirst(count)
        }
    }

    override fun findAlsoParticipatedScenarios(scenario: Scenario): Scenarios {
        return selectList {
            it.specify().derivedParticipate().count({ pCB ->
                pCB.specify().columnParticipateId()
                pCB.query().queryUser().setIsDeleted_Equal(false)
            }, DbScenario.ALIAS_participateCount)
            it.query().existsParticipate { pCB ->
                pCB.query().queryUser().existsParticipate { subPCB ->
                    subPCB.query().setScenarioId_Equal(scenario.id)
                }
            }
            it.query().setScenarioId_NotEqual(scenario.id)
            it.query().setScenarioType_Equal(scenario.type.name)
            // 参加数が多い順
            it.query().addSpecifiedDerivedOrderBy_Desc(DbScenario.ALIAS_participateCount)
            it.fetchFirst(10)
        }
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
        val scenarioId = insertScenario(scenario)
        scenario.authorIds.forEach { insertScenarioAuthor(scenarioId, it) }
        scenario.dictionaryNames.forEach { insertScenarioDictionary(scenarioId, it) }
        return findById(scenarioId)!!
    }

    override fun update(scenario: Scenario): Scenario {
        findById(scenario.id) ?: throw SystemException("scenario not found. id: ${scenario.id}")

        updateScenario(scenario)
        scenarioAuthorBhv.queryDelete { it.query().setScenarioId_Equal(scenario.id) }
        scenario.authorIds.forEach { insertScenarioAuthor(scenario.id, it) }
        scenarioDictionaryBhv.queryDelete { it.query().setScenarioId_Equal(scenario.id) }
        scenario.dictionaryNames.forEach { insertScenarioDictionary(scenario.id, it) }
        return findById(scenario.id)!!
    }

    override fun delete(id: Int) {
        scenarioDictionaryBhv.queryDelete { it.query().setScenarioId_Equal(id) }
        scenarioAuthorBhv.queryDelete { it.query().setScenarioId_Equal(id) }
        scenarioBhv.queryDelete { it.query().setScenarioId_Equal(id) }
    }

    override fun updateGameSystemId(sourceGameSystemId: Int, destGameSystemId: Int) {
        val s = DbScenario()
        s.gameSystemId = destGameSystemId
        scenarioBhv.queryUpdate(s) {
            it.query().setGameSystemId_Equal(sourceGameSystemId)
        }
    }

    override fun integrateDelete(sourceId: Int, destId: Int) {
        // 検索用キーワードを統合先に登録
        val source = findById(sourceId)!!
        val dest = findById(destId)!!
        val sourceDicNames = source.dictionaryNames
        val destDicNames = dest.dictionaryNames
        sourceDicNames.filterNot { destDicNames.contains(it) }.forEach {
            insertScenarioDictionary(destId, it)
        }
        val sourceAuthors = source.authorIds
        val destAuthors = dest.authorIds
        sourceAuthors.filterNot { destAuthors.contains(it) }.forEach {
            insertScenarioAuthor(destId, it)
        }

        // 統合元を削除
        delete(sourceId)
    }

    private fun selectList(cbCall: CBCall<DbScenarioCB>): Scenarios {
        val dbScenarioList = scenarioBhv.selectPage(cbCall)
        scenarioBhv.load(dbScenarioList) {
            it.loadScenarioDictionary {}
            it.loadScenarioAuthor { }
        }
        return mappingToScenarios(dbScenarioList)
    }

    private fun insertScenario(scenario: Scenario): Int {
        val s = DbScenario()
        s.scenarioName = scenario.name
        s.scenarioType = scenario.type.name
        s.scenarioUrl = scenario.url?.value
        s.gameSystemId = scenario.gameSystemId
        s.gameMasterRequirement = scenario.gameMasterRequirement
        s.playerNumMin = scenario.playerNumMin
        s.playerNumMax = scenario.playerNumMax
        s.requiredHours = scenario.requiredHours
        scenarioBhv.insert(s)
        return s.scenarioId
    }

    private fun updateScenario(scenario: Scenario) {
        val s = DbScenario()
        s.scenarioId = scenario.id
        s.scenarioName = scenario.name
        s.scenarioType = scenario.type.name
        s.scenarioUrl = scenario.url?.value
        s.gameSystemId = scenario.gameSystemId
        s.gameMasterRequirement = scenario.gameMasterRequirement
        s.playerNumMin = scenario.playerNumMin
        s.playerNumMax = scenario.playerNumMax
        s.requiredHours = scenario.requiredHours
        scenarioBhv.update(s)
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

    private fun mappingToScenarios(list: PagingResultBean<DbScenario>): Scenarios {
        return Scenarios(
            list = list.map { mappingToScenario(it) },
            allRecordCount = list.allRecordCount,
            allPageCount = list.allPageCount,
            existNextPage = list.existsNextPage(),
            existPrePage = list.existsPreviousPage(),
            currentPageNum = list.currentPageNumber
        )
    }

    private fun mappingToScenario(scenario: DbScenario): Scenario {
        return Scenario(
            id = scenario.scenarioId,
            name = scenario.scenarioName,
            dictionaryNames = scenario.scenarioDictionaryList.map { it.scenarioName },
            type = ScenarioType.valueOf(scenario.scenarioType),
            url = scenario.scenarioUrl?.let { ScenarioUrl(it) },
            gameSystemId = scenario.gameSystemId,
            authorIds = scenario.scenarioAuthorList.map { it.authorId },
            gameMasterRequirement = scenario.gameMasterRequirement,
            playerNumMin = scenario.playerNumMin,
            playerNumMax = scenario.playerNumMax,
            requiredHours = scenario.requiredHours,
            participateCount = scenario.participateCount
        )
    }
}