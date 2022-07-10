package dev.wolfort.scenariotuker.domain.model.author

interface AuthorRepository {

    fun findAll(): Authors

    fun findAllByIds(ids: List<Int>): Authors

    fun search(query: AuthorQuery): Authors

    fun findById(id: Int): Author?

    fun register(author: Author): Author

    fun update(author: Author): Author
}