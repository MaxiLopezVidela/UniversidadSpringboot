package com.example.universidad.controllers

import com.example.universidad.entities.Base
import com.example.universidad.service.BaseServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.io.Serializable

abstract class BaseControllerImpl<E : Base, Id : Serializable, S : BaseServiceImpl<E, Id>>
    : BaseController<E, Id> {

    @Autowired
    protected lateinit var servicio: S

    @GetMapping("")
    override fun getAll(): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.OK).body(servicio.findAll())
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}")
        }
    }

    @GetMapping("/paged")
    override fun getAll(pageable: Pageable): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(pageable))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}")
        }
    }

    @GetMapping("/{id}")
    override fun getOne(@PathVariable id: Id): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde.\"}")
        }
    }

    @PostMapping("")
    override fun save(@RequestBody entity: E): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}")
        }
    }

    @PutMapping("/{id}")
    override fun update(@PathVariable id: Id, @RequestBody entity: E): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}")
        }
    }

    @DeleteMapping("/{id}")
    override fun delete(@PathVariable id: Id): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error, por favor intente mas tarde.\"}")
        }
    }
}