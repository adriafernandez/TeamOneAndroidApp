package com.teamone.hackathon.main.domain.usecase

import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.DataLayer.LogisticRepository
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.PresentationLayer.UseCase.GetLogisticsByDate
import javax.inject.Inject

class GetLogisticsByDate @Inject constructor(
    private val logisticRepository: LogisticRepository
) : GetLogisticsByDate {

    override suspend fun getLogisticsByDate(date1: String, date2: String): Result<Logistics> = logisticRepository.getLogisticsByDate(date1, date2)
}