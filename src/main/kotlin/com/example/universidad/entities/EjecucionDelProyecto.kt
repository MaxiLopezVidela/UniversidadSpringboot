package com.example.universidad.entities


class EjecucionDelProyecto(
    var proyectoDeGradoTerminado: String = "",
    var recursosDisponibles: Int = 0
) {
    val estudiantes: ArrayList<Estudiante> = ArrayList()
    val personalDocentes: ArrayList<PersonalDocente> = ArrayList()
    var resultado: Resultado = Resultado()

    fun addEstudiantes(estudiante: Estudiante) = estudiantes.add(estudiante)
    fun addPersonalDocentes(personalDocente: PersonalDocente) = personalDocentes.add(personalDocente)
}