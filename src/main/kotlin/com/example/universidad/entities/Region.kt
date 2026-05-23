package com.example.universidad.entities

class Region(
    var aspectosSocioCulturales: String = "",
    var nivelGrupal: String = "",
    var nivelPersonal: String = "",
    var parteEspecificaDelPais: String = ""
) {
    val universidades: ArrayList<Universidad> = ArrayList()
    val necesidades: ArrayList<Necesidad> = ArrayList()
    val problemas: ArrayList<Problema> = ArrayList()

    fun addUniversidades(universidad: Universidad) = universidades.add(universidad)
    fun addNecesidades(necesidad: Necesidad) = necesidades.add(necesidad)
    fun addProblemas(problema: Problema) = problemas.add(problema)
}