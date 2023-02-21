package com.teamone.hackathon.main.data.api

import com.teamone.hackathon.main.data.model.LogisticsDto
import com.teamone.hackathon.main.domain.model.Logistics
import retrofit2.Response
import retrofit2.http.GET

interface LogisticsService {

        @GET("logistics")
        suspend fun getAllLogisticsList(): Response<LogisticsDto?>

}