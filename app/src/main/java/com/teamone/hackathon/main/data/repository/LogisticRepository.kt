package com.teamone.hackathon.main.data.repository

import com.teamone.hackathon.common.utils.mockData
import com.teamone.hackathon.main.data.datasource.LogisticsDataSource
import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.DataLayer.LogisticRepository
import javax.inject.Singleton
import kotlin.Result.Companion

@Singleton
object LogisticsRepository :
    LogisticRepository {

    lateinit var logisticsRemoteDataSource: LogisticsDataSource.Remote


    override suspend fun getAllLogisticsList(): Result<Logistics> =
        Result.success(mockData())

    override suspend fun getLogisticsByDate(date1: String, date2: String): Result<Logistics> {
        TODO("Not yet implemented")
    }

}