package com.example.universidad.service

import com.example.universidad.entities.Estudiante

interface EstudianteService : BaseService<Estudiante, Long> {
    fun search(filtro: String): List<Estudiante>
}