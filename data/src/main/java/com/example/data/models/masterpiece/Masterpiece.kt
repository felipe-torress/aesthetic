package com.example.data.models.masterpiece

import java.time.ZonedDateTime

data class Masterpiece(
    val id: Int,
    var name: String?,
    val imageMetadata: String?,
    var description: String?,
    val creationDate: ZonedDateTime?,
    val publishingDate: ZonedDateTime,
)
