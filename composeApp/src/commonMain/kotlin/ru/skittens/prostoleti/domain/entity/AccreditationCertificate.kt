package ru.skittens.prostoleti.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class AccreditationCertificate(
    val id: String,
    val name: String,
    val url: String
)