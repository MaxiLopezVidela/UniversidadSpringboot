package com.example.universidad.controllers

import com.example.universidad.entities.Base
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import java.io.Serializable

interface BaseController<E : Base, Id : Serializable> {
    fun getAll(): ResponseEntity<*>
    fun getAll(pageable: Pageable): ResponseEntity<*>
    fun getOne(id: Id): ResponseEntity<*>
    fun save(entity: E): ResponseEntity<*>
    fun update(id: Id, entity: E): ResponseEntity<*>
    fun delete(id: Id): ResponseEntity<*>
}