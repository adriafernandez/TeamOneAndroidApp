package com.teamone.hackathon.main.data.datasource

import com.teamone.hackathon.main.data.datasource.SignInDataSource.Remote
import com.teamone.hackathon.main.data.model.LogisticsDto
import com.teamone.hackathon.signin.data.api.SignInService
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

interface SignInDataSource {

    interface Remote {

        suspend fun loginUser(): Result<LogisticsDto?>
    }
}

class LoginDataSource @Inject constructor(
    private val retrofitInstance: Retrofit
) : Remote {

    override suspend fun loginUser(): Result<LogisticsDto?> {
        val retrofitResponse: Response<LogisticsDto?> =
            retrofitInstance.create(SignInService::class.java).loginUser()
        return retrofitResponse.runCatching { body() }
    }
}