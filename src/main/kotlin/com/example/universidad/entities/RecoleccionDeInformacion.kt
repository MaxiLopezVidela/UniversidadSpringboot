package com.example.universidad.entities

open class RecoleccionDeInformacion(
    var datosDeLosAfectados: String = "",
    var datosDeLosdirectamenteInteresados: String = "",
    comentariosAbiertosEnLinea: String = "",
    formularioEnLinea: String = "",
    plataformaDeSoftware: Int = 0
) : InterfazIngresoInformacion(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware)