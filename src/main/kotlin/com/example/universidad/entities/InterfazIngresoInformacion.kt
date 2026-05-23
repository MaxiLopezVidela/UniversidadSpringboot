package com.example.universidad.entities

open class InterfazIngresoInformacion(
    var comentariosAbiertosEnLinea: String = "",
    var formularioEnLinea: String = "",
    var plataformaDeSoftware: Int = 0
) {
    val problemas: ArrayList<Problema> = ArrayList()
    val necesidades: ArrayList<Necesidad> = ArrayList()

    fun addProblemas(problema: Problema) = problemas.add(problema)
    fun addNecesidades(necesidad: Necesidad) = necesidades.add(necesidad)
}