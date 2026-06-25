package com.psicapp.api.psychologist.dto

data class CreatePsychologistRequest(
    val name: String,
    val email: String,
    val crp: String
)