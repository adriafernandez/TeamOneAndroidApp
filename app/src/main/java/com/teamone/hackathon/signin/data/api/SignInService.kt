package com.teamone.hackathon.signin.data.api

import com.teamone.hackathon.main.data.model.LogisticsDto
import com.teamone.hackathon.main.domain.model.Logistics
import retrofit2.Response
import retrofit2.http.GET

interface SignInService {

        @GET("/api/Auth/Login")
        suspend fun loginUser(): Response<LogisticsDto?>

}