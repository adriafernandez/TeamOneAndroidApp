package com.teamone.hackathon.common.utils

import retrofit2.Converter
import retrofit2.Retrofit

private const val DEFAULT_BASE_URL: String = "http://google.es"

fun getRetrofitLoginInstance(
    baseUrl: String = DEFAULT_BASE_URL,
    converterFactory: Converter.Factory
) : Retrofit =
    Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(converterFactory)
        .build()