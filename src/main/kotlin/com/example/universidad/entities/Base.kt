package com.example.universidad.entities

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
open class Base(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long = 0
)