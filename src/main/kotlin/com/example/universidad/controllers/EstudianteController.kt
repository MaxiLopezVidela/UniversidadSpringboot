package com.example.universidad.controllers

import com.example.universidad.entities.Estudiante
import com.example.universidad.service.EstudianteServiceImpl
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping(path = ["api/v1/estudiantes"])
class EstudianteController : BaseControllerImpl<Estudiante, Long, EstudianteServiceImpl>() {

    @GetMapping("/search")
    fun search(@RequestParam filtro: String): ResponseEntity<*> {
        return try {
            ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro))
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"${e.message}\"}")
        }
    }
}