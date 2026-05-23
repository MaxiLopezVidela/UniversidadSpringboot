package com.example.universidad.entities


class Recopilacion(
    var datosMayorFavorabilidad: String = "",
    var datosMayorUrgencia: String = "",
    datosDeLosAfectados: String = "",
    datosDeLosdirectamenteInteresados: String = "",
    comentariosAbiertosEnLinea: String = "",
    formularioEnLinea: String = "",
    plataformaDeSoftware: Int = 0
) : RecoleccionDeInformacion(datosDeLosAfectados, datosDeLosdirectamenteInteresados, comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware)