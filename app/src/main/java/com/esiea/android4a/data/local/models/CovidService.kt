package com.esiea.android4a.data.local.models

import retrofit2.Call
import retrofit2.http.GET


interface CovidService {

    @GET("france")
    fun getAffectedFoodList () : Call<List<CovidCase>>

}