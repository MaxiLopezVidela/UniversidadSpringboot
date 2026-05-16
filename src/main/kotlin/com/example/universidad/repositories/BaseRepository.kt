package com.example.universidad.repositories


import com.example.universidad.entities.Base
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean
import java.io.Serializable

@NoRepositoryBean
interface BaseRepository<E : Base, Id : Serializable> : JpaRepository<E, Id>