package com.teamone.hackathon.signin.data.api

import com.teamone.hackathon.main.data.model.LogisticsDto
import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.signin.data.model.TokenDto
import com.teamone.hackathon.signin.domain.model.Token
import retrofit2.Response
import retrofit2.http.GET

interface SignInService {

        @GET("/api/Auth/Login")
        suspend fun loginUser(): Response<Token?>

}