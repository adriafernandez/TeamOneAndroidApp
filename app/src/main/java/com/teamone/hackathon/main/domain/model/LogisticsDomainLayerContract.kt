package com.teamone.hackathon.main.domain.model

interface LogisticsDomainLayerContract {

    interface PresentationLayer {

        interface UseCase {

            interface GetAllLogistics {

                suspend fun getAllLogistics(): Result<Logistics>

            }

            interface GetLogisticsByDate {

                suspend fun getLogisticsByDate(date1: String, date2: String): Result<Logistics>

            }

        }
    }

    interface DataLayer {

        interface LogisticRepository {

            suspend fun getAllLogisticsList(): Result<Logistics>

            suspend fun getLogisticsByDate(date1: String, date2: String): Result<Logistics>

        }
    }
}