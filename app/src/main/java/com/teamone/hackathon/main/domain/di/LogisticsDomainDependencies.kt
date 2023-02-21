package com.teamone.hackathon.main.domain.di

import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.PresentationLayer.UseCase
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.PresentationLayer.UseCase.GetAllLogistics
import com.teamone.hackathon.main.domain.usecase.GetAllLogisticsUc
import com.teamone.hackathon.main.domain.usecase.GetLogisticsByDate
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class LogisticsDomainDependencies {

    @Provides
    fun providesGetAllLogisticsUc(usecase: GetAllLogisticsUc): @JvmSuppressWildcards GetAllLogistics = usecase

    @Provides
    fun providesGetLogisticsByDateUc(usecase: GetLogisticsByDate): @JvmSuppressWildcards UseCase.GetLogisticsByDate = usecase
}