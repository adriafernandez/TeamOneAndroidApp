package com.teamone.hackathon.main.data.di

import com.teamone.hackathon.main.data.datasource.LogisticDataSource
import com.teamone.hackathon.main.data.datasource.LogisticsDataSource
import com.teamone.hackathon.main.data.repository.LogisticsRepository
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.DataLayer.LogisticRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class LogisticsDataModule {

    @Provides
    fun providesLogisticsRepository(
        remoteDataSource: LogisticsDataSource.Remote
    ): LogisticRepository = LogisticsRepository.apply {
        logisticsRemoteDataSource = remoteDataSource
    }

    @Provides
    fun providesLogisticsRemoteDataSource(logisticsDataSource: LogisticDataSource): LogisticsDataSource.Remote =
        logisticsDataSource

}