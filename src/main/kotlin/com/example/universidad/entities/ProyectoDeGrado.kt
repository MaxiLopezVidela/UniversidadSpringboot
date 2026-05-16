package com.example.universidad.entities

import jakarta.persistence.*

@Entity
@Table(name = "proyecto_de_grado")
open class ProyectoDeGrado(
    val titulo: String = "",
    val objetivo: String = "",
    val alcance: String = "",
    val costo: Int = 0,
    val tiempoDeRealizacion: Int = 0,
    val viabilidad: Int = 0,
    val planDeProyecto: String = ""
) : Base()