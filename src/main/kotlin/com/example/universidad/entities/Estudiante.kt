package com.example.universidad.entities

import jakarta.persistence.*

@Entity
@Table(name = "estudiante")
open class Estudiante(
    val nombre: String = "",
    val apellido: String = "",

    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval = true)
    @JoinColumn(name = "proyecto_id")
    open var proyectoDeGrado: ProyectoDeGrado? = null
) : Base()