package com.teamone.hackathon.signin.domain.usecase

import com.teamone.hackathon.main.data.repository.SignInRepository
import com.teamone.hackathon.signin.domain.model.SignInDomainLayerContract.PresentationLayer.UseCase.LoginUser
import com.teamone.hackathon.signin.domain.model.Token
import javax.inject.Inject

class LoginUser @Inject constructor(
    private val loginRepository: SignInRepository
) : LoginUser {

    override suspend fun loginUser(): Result<Token?> = loginRepository.signInRemoteDataSource.loginUser()
}