package com.example.universidad.service

import com.example.universidad.entities.Base
import com.example.universidad.repositories.BaseRepository
import jakarta.transaction.Transactional
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable
import java.util.Optional

abstract class BaseServiceImpl<E : Base, Id : Serializable>(
    protected val baseRepository: BaseRepository<E, Id>
) : BaseService<E, Id> {

    @Transactional
    override fun findAll(): List<E> {
        return baseRepository.findAll()
    }

    @Transactional
    override fun findAll(pageable: Pageable): Page<E> {
        return baseRepository.findAll(pageable)
    }

    @Transactional
    override fun findById(id: Id): E {
        return baseRepository.findById(id).get()
    }

    @Transactional
    override fun save(entity: E): E {
        return baseRepository.save(entity)
    }

    @Transactional
    override fun update(id: Id, entity: E): E {
        entity.id = id as Long
        return baseRepository.save(entity)
    }

    @Transactional
    override fun delete(id: Id): Boolean {
        return if (baseRepository.existsById(id)) {
            baseRepository.deleteById(id)
            true
        } else {
            throw Exception("No se encontró el registro")
        }
    }
}