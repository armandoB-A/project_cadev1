package com.beyondthecode.cadev1.api.repositorios

import com.beyondthecode.cadev1.api.modelos.InicioDto
import retrofit2.Call
import retrofit2.http.GET

interface InicioRepository {
    @GET("/inicio")
    fun getInicio(): Call<InicioDto>
}
