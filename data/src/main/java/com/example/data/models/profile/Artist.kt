package com.example.data.models.profile

import java.util.Date
import java.util.Locale

data class Artist(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val pronouns: List<Pronouns>?,
    val birthday: Date,
    val country: Locale,
    val biography: String?
)

enum class Pronouns(val string: String) {
    //region --- MALE ---
    HE("he"),
    HIM("him"),
    //endregion

    //region --- FEMALE ---
    SHE("she"),
    HER("her"),
    //endregion

    //region --- NEUTRAL/FLUID ---
    THEY("they"),
    THEM("them"),
    ZE("ze"),
    ZIR("zir"),
    //endregion
}
