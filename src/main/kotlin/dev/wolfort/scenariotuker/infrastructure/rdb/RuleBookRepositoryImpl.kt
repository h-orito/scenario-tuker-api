package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbRuleBookBhv
import dev.wolfort.dbflute.exbhv.DbRuleBookDictionaryBhv
import dev.wolfort.dbflute.exentity.DbRuleBook
import dev.wolfort.dbflute.exentity.DbRuleBookDictionary
import dev.wolfort.scenariotuker.domain.model.rulebook.*
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Repository

@Repository
class RuleBookRepositoryImpl(
    private val ruleBookBhv: DbRuleBookBhv,
    private val ruleBookDictionaryBhv: DbRuleBookDictionaryBhv
) : RuleBookRepository {

    override fun findAll(): RuleBooks {
        val dbRuleBookList = ruleBookBhv.selectList {
            it.query().addOrderBy_RuleBookId_Asc()
        }
        ruleBookBhv.loadRuleBookDictionary(dbRuleBookList) {}
        return mappingToRuleBooks(dbRuleBookList)
    }

    override fun findAllByIds(ids: List<Int>): RuleBooks {
        if (ids.isEmpty()) return RuleBooks(list = emptyList())
        val dbRuleBookList = ruleBookBhv.selectList {
            it.query().setRuleBookId_InScope(ids)
        }
        ruleBookBhv.loadRuleBookDictionary(dbRuleBookList) {}
        // リクエスト順に並び替える
        return mappingToRuleBooks(ids.map { id -> dbRuleBookList.first { it.ruleBookId == id } })
    }

    override fun findAllByGameSystemId(gameSystemId: Int): RuleBooks {
        val dbRuleBookList = ruleBookBhv.selectList {
            it.query().setGameSystemId_Equal(gameSystemId)
            it.query().addOrderBy_RuleBookId_Asc()
        }
        ruleBookBhv.loadRuleBookDictionary(dbRuleBookList) {}
        return mappingToRuleBooks(dbRuleBookList)
    }

    override fun findById(id: Int): RuleBook? {
        val optDbRuleBook = ruleBookBhv.selectEntity {
            it.query().setRuleBookId_Equal(id)
        }
        if (!optDbRuleBook.isPresent) return null
        val dbRuleBook = optDbRuleBook.get()
        ruleBookBhv.loadRuleBookDictionary(dbRuleBook) {}
        return mappingToRuleBook(dbRuleBook)
    }

    override fun search(query: RuleBookQuery): RuleBooks {
        if (query.isEmpty()) return RuleBooks(list = emptyList())
        val list = ruleBookBhv.selectList {
            if (!query.name.isNullOrEmpty()) {
                it.query().existsRuleBookDictionary { dicCB ->
                    dicCB.query().setRuleBookName_LikeSearch(query.name) { op ->
                        op.splitByBlank().likeContain().asOrSplit()
                    }
                }
            }
            query.gameSystemId?.let { gameSystemId ->
                it.query().setGameSystemId_Equal(gameSystemId)
            }
            query.ruleBookType?.let { type ->
                it.query().setRuleBookType_Equal(type.name)
            }
            it.query().addOrderBy_RuleBookId_Asc()
        }
        ruleBookBhv.loadRuleBookDictionary(list) {}
        return mappingToRuleBooks(list)
    }

    override fun register(ruleBook: RuleBook): RuleBook {
        val s = DbRuleBook()
        s.ruleBookName = ruleBook.name
        s.ruleBookType = ruleBook.type.name
        s.gameSystemId = ruleBook.gameSystemId
        ruleBookBhv.insert(s)

        ruleBook.dictionaryNames.forEach { insertRuleBookDictionary(s.ruleBookId, it) }
        return findById(s.ruleBookId)!!
    }

    override fun update(ruleBook: RuleBook): RuleBook {
        findById(ruleBook.id) ?: throw SystemException("ruleBook not found. id: ${ruleBook.id}")

        val s = DbRuleBook()
        s.ruleBookId = ruleBook.id
        s.ruleBookName = ruleBook.name
        s.ruleBookType = ruleBook.type.name
        s.gameSystemId = ruleBook.gameSystemId
        ruleBookBhv.update(s)

        ruleBookDictionaryBhv.queryDelete { it.query().setRuleBookId_Equal(ruleBook.id) }
        ruleBook.dictionaryNames.forEach { insertRuleBookDictionary(ruleBook.id, it) }

        return findById(ruleBook.id)!!
    }

    override fun delete(id: Int) {
        ruleBookDictionaryBhv.queryDelete { it.query().setRuleBookId_Equal(id) }
        ruleBookBhv.queryDelete { it.query().setRuleBookId_Equal(id) }
    }

    private fun insertRuleBookDictionary(ruleBookId: Int, name: String) {
        val d = DbRuleBookDictionary()
        d.ruleBookId = ruleBookId
        d.ruleBookName = name
        ruleBookDictionaryBhv.insert(d)
    }

    private fun mappingToRuleBooks(list: List<DbRuleBook>): RuleBooks {
        return RuleBooks(list = list.map { mappingToRuleBook(it) })
    }

    private fun mappingToRuleBook(ruleBook: DbRuleBook): RuleBook {
        return RuleBook(
            id = ruleBook.ruleBookId,
            name = ruleBook.ruleBookName,
            dictionaryNames = ruleBook.ruleBookDictionaryList.map { it.ruleBookName },
            type = RuleBookType.valueOf(ruleBook.ruleBookType),
            gameSystemId = ruleBook.gameSystemId
        )
    }
}