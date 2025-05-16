package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.cbean.DbScenarioCB
import dev.wolfort.dbflute.exbhv.DbScenarioAuthorBhv
import dev.wolfort.dbflute.exbhv.DbScenarioBhv
import dev.wolfort.dbflute.exbhv.DbScenarioDictionaryBhv
import dev.wolfort.dbflute.exbhv.DbScenarioGameSystemBhv
import dev.wolfort.dbflute.exentity.DbScenario
import dev.wolfort.dbflute.exentity.DbScenarioAuthor
import dev.wolfort.dbflute.exentity.DbScenarioDictionary
import dev.wolfort.dbflute.exentity.DbScenarioGameSystem
import dev.wolfort.scenariotuker.domain.model.scenario.Scenario
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioQuery
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioRepository
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioType
import dev.wolfort.scenariotuker.domain.model.scenario.ScenarioUrl
import dev.wolfort.scenariotuker.domain.model.scenario.Scenarios
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.dbflute.bhv.readable.CBCall
import org.dbflute.cbean.result.PagingResultBean
import org.springframework.stereotype.Repository

@Repository
class ScenarioRepositoryImpl(
    private val scenarioBhv: DbScenarioBhv,
    private val scenarioGameSystemBhv: DbScenarioGameSystemBhv,
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
                it.query().existsScenarioGameSystem {
                    it.query().setGameSystemId_Equal(gameSystemId)
                }
            }
            if (!query.gameSystemName.isNullOrEmpty()) {
                it.query().existsScenarioGameSystem {
                    it.query().queryGameSystem().setGameSystemName_LikeSearch(query.gameSystemName) { op ->
                        op.splitByBlank().likeContain().asOrSplit()
                    }
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
            it.query().existsScenarioGameSystem {
                it.query().setGameSystemId_Equal(gameSystemId)
            }
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
        scenario.gameSystemIds.forEach { insertScenarioGameSystem(scenarioId, it) }
        scenario.authorIds.forEach { insertScenarioAuthor(scenarioId, it) }
        scenario.dictionaryNames.forEach { insertScenarioDictionary(scenarioId, it) }
        return findById(scenarioId)!!
    }

    override fun update(scenario: Scenario): Scenario {
        findById(scenario.id) ?: throw SystemException("scenario not found. id: ${scenario.id}")

        updateScenario(scenario)
        scenarioGameSystemBhv
        scenarioGameSystemBhv.queryDelete { it.query().setScenarioId_Equal(scenario.id) }
        scenario.gameSystemIds.forEach { insertScenarioGameSystem(scenario.id, it) }
        scenarioAuthorBhv.queryDelete { it.query().setScenarioId_Equal(scenario.id) }
        scenario.authorIds.forEach { insertScenarioAuthor(scenario.id, it) }
        scenarioDictionaryBhv.queryDelete { it.query().setScenarioId_Equal(scenario.id) }
        scenario.dictionaryNames.forEach { insertScenarioDictionary(scenario.id, it) }
        return findById(scenario.id)!!
    }

    override fun delete(id: Int) {
        scenarioGameSystemBhv.queryDelete { it.query().setScenarioId_Equal(id) }
        scenarioDictionaryBhv.queryDelete { it.query().setScenarioId_Equal(id) }
        scenarioAuthorBhv.queryDelete { it.query().setScenarioId_Equal(id) }
        scenarioBhv.queryDelete { it.query().setScenarioId_Equal(id) }
    }

    override fun updateGameSystemId(sourceGameSystemId: Int, destGameSystemId: Int) {
        val sourceScenarioGameSystems = scenarioGameSystemBhv.selectList {
            it.query().setGameSystemId_Equal(sourceGameSystemId)
        }
        if (sourceScenarioGameSystems.isEmpty()) return
        scenarioGameSystemBhv.queryDelete {
            it.query().setGameSystemId_Equal(sourceGameSystemId)
        }
        val destScenarioGameSystems = scenarioGameSystemBhv.selectList {
            it.query().setGameSystemId_Equal(destGameSystemId)
        }
        sourceScenarioGameSystems.filterNot {
            destScenarioGameSystems.any { it.scenarioId == it.scenarioId }
        }.forEach {
            val sgs = DbScenarioGameSystem()
            sgs.scenarioId = it.scenarioId
            sgs.gameSystemId = destGameSystemId
            scenarioGameSystemBhv.insert(sgs)
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
        val sourceGameSystems = source.gameSystemIds
        val destGameSystems = dest.gameSystemIds
        sourceGameSystems.filterNot { destGameSystems.contains(it) }.forEach {
            insertScenarioGameSystem(destId, it)
        }

        // 統合元を削除
        delete(sourceId)
    }

    private fun selectList(cbCall: CBCall<DbScenarioCB>): Scenarios {
        val dbScenarioList = scenarioBhv.selectPage(cbCall)
        scenarioBhv.load(dbScenarioList) {
            it.loadScenarioGameSystem { }
            it.loadScenarioDictionary { }
            it.loadScenarioAuthor { }
        }
        return mappingToScenarios(dbScenarioList)
    }

    private fun insertScenario(scenario: Scenario): Int {
        val s = DbScenario()
        s.scenarioName = scenario.name
        s.scenarioType = scenario.type.name
        s.scenarioUrl = scenario.url?.value
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
        s.gameMasterRequirement = scenario.gameMasterRequirement
        s.playerNumMin = scenario.playerNumMin
        s.playerNumMax = scenario.playerNumMax
        s.requiredHours = scenario.requiredHours
        scenarioBhv.update(s)
    }

    private fun insertScenarioGameSystem(scenarioId: Int, gameSystemId: Int) {
        val sgs = DbScenarioGameSystem()
        sgs.scenarioId = scenarioId
        sgs.gameSystemId = gameSystemId
        scenarioGameSystemBhv.insert(sgs)

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
            gameSystemIds = scenario.scenarioGameSystemList.map { it.gameSystemId },
            authorIds = scenario.scenarioAuthorList.map { it.authorId },
            gameMasterRequirement = scenario.gameMasterRequirement,
            playerNumMin = scenario.playerNumMin,
            playerNumMax = scenario.playerNumMax,
            requiredHours = scenario.requiredHours,
            participateCount = scenario.participateCount
        )
    }
}