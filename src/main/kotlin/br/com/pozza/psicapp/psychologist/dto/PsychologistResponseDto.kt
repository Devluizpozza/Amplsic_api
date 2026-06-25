package com.psicapp.api.psychologist.dto

import java.time.LocalDateTime
import java.util.UUID

data class PsychologistResponse(
    val id: UUID,
    val name: String,
    val email: String,
    val crp: String,
    val createdAt: LocalDateTime?
)