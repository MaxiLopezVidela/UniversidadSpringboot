package com.example.universidad.entities

class PersonalDocente(
    var conocimiento: String = "",
    var experiencia: String = "",
    var trayectoria: Int = 0,
    var estudiante: Estudiante? = null,
    var ejecucionDelProyecto: EjecucionDelProyecto? = null,
    var recopilacion: Recopilacion? = null
) {
    val universidades: ArrayList<Universidad> = ArrayList()

    fun addUniversidades(universidad: Universidad) = universidades.add(universidad)
}