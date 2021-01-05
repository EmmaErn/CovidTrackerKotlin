package com.esiea.android4a.data.local.models

import java.io.Serializable

data class CovidCase(
    val Country: String,
    val CountryCode: String,
    val Province: String,
    val City: String,
    val CityCode: String,
    val Lat: String,
    val Lon: String,
    val Confirmed: Int,
    val Deaths: Int,
    val Recovered: Int,
    val Active: Int,
    val Date: String

    ) : Serializable
