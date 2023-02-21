package com.teamone.hackathon.main.data.repository

import com.teamone.hackathon.main.data.datasource.SignInDataSource.Remote
import com.teamone.hackathon.signin.domain.model.SignInDomainLayerContract.DataLayer.LoginRepository
import com.teamone.hackathon.signin.domain.model.Token
import javax.inject.Singleton

@Singleton
object SignInRepository : LoginRepository
     {

    lateinit var signInRemoteDataSource: Remote
         override suspend fun loginUser(): Result<Token> {
             TODO("Not yet implemented")
         }
     }