package com.teamone.hackathon.main.data.repository

import com.teamone.hackathon.main.data.datasource.SignInDataSource.Remote
import javax.inject.Singleton

@Singleton
object SignInRepository :
    SignInRepository {

    lateinit var signInRemoteDataSource: Remote


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