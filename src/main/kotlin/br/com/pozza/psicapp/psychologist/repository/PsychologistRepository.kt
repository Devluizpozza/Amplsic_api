package br.com.pozza.psicapp.psychologist.repository

import br.com.pozza.psicapp.psychologist.entity.Psychologist
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface PsychologistRepository :
    JpaRepository<Psychologist, UUID>