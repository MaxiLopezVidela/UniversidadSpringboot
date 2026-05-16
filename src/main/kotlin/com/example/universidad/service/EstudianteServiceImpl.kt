package com.example.universidad.service

import com.example.universidad.entities.Estudiante
import com.example.universidad.repositories.BaseRepository
import com.example.universidad.repositories.EstudianteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EstudianteServiceImpl(
    baseRepository: BaseRepository<Estudiante, Long>
) : BaseServiceImpl<Estudiante, Long>(baseRepository), EstudianteService {

    @Autowired
    private lateinit var estudianteRepository: EstudianteRepository

    override fun search(filtro: String): List<Estudiante> {
        return emptyList()
    }
}