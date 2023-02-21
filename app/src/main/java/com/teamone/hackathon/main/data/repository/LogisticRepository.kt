package com.teamone.hackathon.main.data.repository

import com.teamone.hackathon.main.data.datasource.LogisticsDataSource
import com.teamone.hackathon.main.domain.model.Logistic
import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.DataLayer.LogisticRepository
import javax.inject.Singleton

@Singleton
object LogisticsRepository :
    LogisticRepository {

    lateinit var logisticsRemoteDataSource: LogisticsDataSource.Remote

    override suspend fun getAllLogisticsList(): Result<Logistics> =
        Result.success(
            Logistics(
                listOf(
                    Logistic(
                        "3444",
                        3,
                        "dff",
                        3,
                        3,
                        3,
                        3,
                        3,
                        3
                    ),
                    Logistic(
                        "34444454",
                        3,
                        "df344f",
                        3,
                        3,
                        3,
                        3,
                        3,
                        3
                    )
                )
            )
        )

    override suspend fun getLogisticsByDate(date1: String, date2: String): Result<Logistics> {
        TODO("Not yet implemented")
    }
    /* try {
         logisticsRemoteDataSource.getAllLogisticsListResponse().map { dto ->
             dto.toLogistics()
         }
     } catch (e: Exception) {
         println("Fallo en la llamada")
         Result.success(
             Logistics(
                 listOf()
             )
         )

     } */
}