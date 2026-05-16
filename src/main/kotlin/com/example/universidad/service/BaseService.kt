package com.example.universidad.service

import com.example.universidad.entities.Base
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

interface BaseService<E : Base, Id : Serializable> {
    fun findAll(): List<E>
    fun findAll(pageable: Pageable): Page<E>
    fun findById(id: Id): E
    fun save(entity: E): E
    fun update(id: Id, entity: E): E
    fun delete(id: Id): Boolean
}