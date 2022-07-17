package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.bsbhv.DbBsGameSystemBhv
import dev.wolfort.dbflute.bsbhv.DbBsGameSystemDictionaryBhv
import dev.wolfort.dbflute.exentity.DbGameSystem
import dev.wolfort.dbflute.exentity.DbGameSystemDictionary
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystem
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemQuery
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystemRepository
import dev.wolfort.scenariotuker.domain.model.gamesystem.GameSystems
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Repository

@Repository
class GameSystemRepositoryImpl(
    private val gameSystemBhv: DbBsGameSystemBhv,
    private val gameSystemDictionaryBhv: DbBsGameSystemDictionaryBhv
) : GameSystemRepository {

    override fun findAll(): GameSystems {
        val list = gameSystemBhv.selectList {
            it.query().addOrderBy_GameSystemId_Asc()
        }
        gameSystemBhv.loadGameSystemDictionary(list) {}
        return mappingToGameSystems(list)
    }

    override fun findAllByIds(ids: List<Int>): GameSystems {
        if (ids.isEmpty()) return GameSystems(list = emptyList())
        val list = gameSystemBhv.selectList {
            it.query().setGameSystemId_InScope(ids)
            it.query().addOrderBy_GameSystemId_Asc()
        }
        gameSystemBhv.loadGameSystemDictionary(list) {}
        return mappingToGameSystems(list)
    }

    override fun search(query: GameSystemQuery): GameSystems {
        if (query.name.isEmpty()) return GameSystems(list = emptyList())
        val list = gameSystemBhv.selectList {
            it.query().existsGameSystemDictionary { dicCB ->
                dicCB.query().setGameSystemName_LikeSearch(query.name) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            it.query().addOrderBy_GameSystemId_Asc()
        }
        gameSystemBhv.loadGameSystemDictionary(list) {}
        return mappingToGameSystems(list)
    }

    override fun findById(id: Int): GameSystem? {
        val dbGameSystem = gameSystemBhv.selectEntity {
            it.query().setGameSystemId_Equal(id)
        }
        if (!dbGameSystem.isPresent) return null
        val gs = dbGameSystem.get()
        gameSystemBhv.loadGameSystemDictionary(gs) {}
        return mappingToGameSystem(gs)
    }

    override fun register(gameSystem: GameSystem): GameSystem {
        val g = DbGameSystem()
        g.gameSystemName = gameSystem.name
        gameSystemBhv.insert(g)
        gameSystem.dictionaryNames.forEach { insertGameSystemDictionary(g.gameSystemId, it) }
        return findById(g.gameSystemId)!!
    }

    override fun update(gameSystem: GameSystem): GameSystem {
        val existing = findById(gameSystem.id) ?: throw SystemException("game system not found. id: ${gameSystem.id}")
        val g = DbGameSystem()
        g.gameSystemId = existing.id
        g.gameSystemName = gameSystem.name
        gameSystemBhv.update(g)
        gameSystemDictionaryBhv.queryDelete { it.query().setGameSystemId_Equal(gameSystem.id) }
        gameSystem.dictionaryNames.forEach { insertGameSystemDictionary(gameSystem.id, it) }
        return findById(gameSystem.id)!!
    }

    private fun insertGameSystemDictionary(gameSystemId: Int?, name: String) {
        val d = DbGameSystemDictionary()
        d.gameSystemId = gameSystemId
        d.gameSystemName = name
        gameSystemDictionaryBhv.insert(d)
    }

    private fun mappingToGameSystems(list: List<DbGameSystem>): GameSystems =
        GameSystems(list = list.map { mappingToGameSystem(it) })

    private fun mappingToGameSystem(gameSystem: DbGameSystem) =
        GameSystem(
            id = gameSystem.gameSystemId,
            name = gameSystem.gameSystemName,
            dictionaryNames = gameSystem.gameSystemDictionaryList.map { it.gameSystemName }
        )
}