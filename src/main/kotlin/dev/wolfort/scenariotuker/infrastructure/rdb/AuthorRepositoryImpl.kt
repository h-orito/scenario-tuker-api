package dev.wolfort.scenariotuker.infrastructure.rdb

import dev.wolfort.dbflute.exbhv.DbAuthorBhv
import dev.wolfort.dbflute.exentity.DbAuthor
import dev.wolfort.scenariotuker.domain.model.author.Author
import dev.wolfort.scenariotuker.domain.model.author.AuthorQuery
import dev.wolfort.scenariotuker.domain.model.author.AuthorRepository
import dev.wolfort.scenariotuker.domain.model.author.Authors
import dev.wolfort.scenariotuker.fw.exception.SystemException
import org.springframework.stereotype.Repository

@Repository
class AuthorRepositoryImpl(
    private val authorBhv: DbAuthorBhv
) : AuthorRepository {

    override fun findAll(): Authors {
        val list = authorBhv.selectList {
            it.query().addOrderBy_AuthorName_Asc()
        }
        return mappingToAuthors(list)
    }

    override fun findAllByIds(ids: List<Int>): Authors {
        if (ids.isEmpty()) return Authors(list = emptyList())
        val list = authorBhv.selectList {
            it.query().setAuthorId_InScope(ids)
            it.query().addOrderBy_AuthorName_Asc()
        }
        return mappingToAuthors(list)
    }

    override fun search(query: AuthorQuery): Authors {
        val list = authorBhv.selectList {
            if (query.name.isNotEmpty()) {
                it.query().setAuthorName_LikeSearch(query.name) { op ->
                    op.splitByBlank().likeContain().asOrSplit()
                }
            }
            it.query().addOrderBy_AuthorName_Asc()
        }
        return mappingToAuthors(list)
    }

    override fun findById(id: Int): Author? {
        val author = authorBhv.selectEntity {
            it.query().setAuthorId_Equal(id)
        }
        return author.map { mappingToAuthor(it) }.orElse(null)
    }

    override fun register(author: Author): Author {
        val a = DbAuthor()
        a.authorName = author.name
        authorBhv.insert(a)
        return findById(a.authorId)!!
    }

    override fun update(author: Author): Author {
        val exists = authorBhv.selectEntity {
            it.query().setAuthorId_Equal(author.id)
        } ?: throw SystemException("author not found. id: ${author.id}")
        val a = exists.get()
        a.authorName = author.name
        authorBhv.update(a)
        return findById(a.authorId)!!
    }

    private fun mappingToAuthors(list: List<DbAuthor>): Authors =
        Authors(list = list.map { mappingToAuthor(it) })

    private fun mappingToAuthor(author: DbAuthor) =
        Author(id = author.authorId, name = author.authorName)
}