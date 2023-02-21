package com.teamone.hackathon.main.domain.usecase

import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.DataLayer.LogisticRepository
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.PresentationLayer.UseCase.GetAllLogistics
import javax.inject.Inject

class GetAllLogisticsUc @Inject constructor(
    private val logisticRepository: LogisticRepository
) : GetAllLogistics {

    override suspend fun getAllLogistics(): Result<Logistics> = logisticRepository.getAllLogisticsList()
}