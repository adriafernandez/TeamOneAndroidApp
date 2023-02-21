package com.teamone.hackathon.main.data.datasource

import com.teamone.hackathon.main.data.api.LogisticsService
import com.teamone.hackathon.main.data.datasource.LogisticsDataSource.Remote
import com.teamone.hackathon.main.data.model.LogisticsDto
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

interface LogisticsDataSource {

    interface Remote {

        suspend fun getAllLogisticsListResponse(): Result<LogisticsDto?>
    }
}

class LogisticDataSource @Inject constructor(
    private val retrofitInstance: Retrofit
) : Remote {

    override suspend fun getAllLogisticsListResponse(): Result<LogisticsDto?> {
        val retrofitResponse: Response<LogisticsDto?> =
            retrofitInstance.create(LogisticsService::class.java).getAllLogisticsList()
        return retrofitResponse.runCatching { body() }
    }
}