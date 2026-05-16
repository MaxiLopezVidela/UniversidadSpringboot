package com.example.universidad.repositories

import com.example.universidad.entities.Estudiante
import org.springframework.data.jpa.repository.JpaRepository

import org.springframework.stereotype.Repository

@Repository
interface EstudianteRepository : BaseRepository<Estudiante, Long>