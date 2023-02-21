package com.teamone.hackathon.main.data.datasource

import com.teamone.hackathon.main.data.datasource.SignInDataSource.Remote
import com.teamone.hackathon.main.data.model.LogisticsDto
import com.teamone.hackathon.signin.data.api.SignInService
import com.teamone.hackathon.signin.data.model.TokenDto
import com.teamone.hackathon.signin.domain.model.Token
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject

interface SignInDataSource {

    interface Remote {

        suspend fun loginUser(): Result<Token?>
    }
}

class LoginDataSource @Inject constructor(
    private val retrofitInstance: Retrofit
) : Remote {

    override suspend fun loginUser(): Result<Token?> {
        val retrofitResponse: Response<Token?> =
            retrofitInstance.create(SignInService::class.java).loginUser()
        return retrofitResponse.runCatching { body() }
    }
}