package com.example.data.models.masterpiece

import java.time.ZonedDateTime

data class Masterpiece(
    val id: Int,
    var name: String?,
    val imageMetadata: String?,
    val imageData: String?,
    var description: String?,
    val creationDate: ZonedDateTime?,
    var updateDate: ZonedDateTime?,
    val publishingDate: ZonedDateTime,
)
