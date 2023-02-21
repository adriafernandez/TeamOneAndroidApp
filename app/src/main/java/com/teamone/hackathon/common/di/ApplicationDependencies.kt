package com.teamone.hackathon.common.di

import com.teamone.hackathon.common.utils.getRetrofitLoginInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UtilsModule {

    @Singleton
    @Provides
    fun providesMoshiConvertFactory(): Converter.Factory =
        MoshiConverterFactory.create()

    @Singleton
    @Provides
    fun providesRetrofit(converterFactory: Converter.Factory): Retrofit =
        getRetrofitLoginInstance(converterFactory = converterFactory)
}
