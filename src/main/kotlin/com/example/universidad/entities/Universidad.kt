package com.example.universidad.entities

class Universidad(
    var cunaDelConocimiento: String = "",
    var diferentesCarreras: String = "",
    var privada: String = "",
    var publica: String = ""
) {
    val estudiantes: ArrayList<Estudiante> = ArrayList()
    val regiones: ArrayList<Region> = ArrayList()
    val recoleccionDeInformaciones: ArrayList<RecoleccionDeInformacion> = ArrayList()
    val personalDocentes: ArrayList<PersonalDocente> = ArrayList()

    fun addEstudiantes(estudiante: Estudiante) = estudiantes.add(estudiante)
    fun addRegiones(region: Region) = regiones.add(region)
    fun addRecoleccionDeInformaciones(r: RecoleccionDeInformacion) = recoleccionDeInformaciones.add(r)
    fun addPersonalDocentes(personalDocente: PersonalDocente) = personalDocentes.add(personalDocente)
}