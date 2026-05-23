package com.example.universidad.entities

class Soluciones(
    var alternativas: String = ""
) {
    val estudiantes: ArrayList<Estudiante> = ArrayList()

    fun addEstudiantes(estudiante: Estudiante) = estudiantes.add(estudiante)
}