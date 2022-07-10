package dev.wolfort.scenariotuker.application.service

import dev.wolfort.scenariotuker.domain.model.author.Author
import dev.wolfort.scenariotuker.domain.model.author.AuthorQuery
import dev.wolfort.scenariotuker.domain.model.author.AuthorRepository
import dev.wolfort.scenariotuker.domain.model.author.Authors
import org.springframework.stereotype.Service

@Service
class AuthorService(
    private val authorRepository: AuthorRepository
) {

    fun findAll(): Authors = authorRepository.findAll()

    fun findAllByIds(ids: List<Int>): Authors = authorRepository.findAllByIds(ids)

    fun search(query: AuthorQuery): Authors = authorRepository.search(query = query)

    fun findById(id: Int): Author? = authorRepository.findById(id)

    fun register(author: Author): Author = authorRepository.register(author)

    fun update(author: Author): Author = authorRepository.update(author)
}