package com.teamone.hackathon.main.data.di

import com.teamone.hackathon.main.data.datasource.LoginDataSource
import com.teamone.hackathon.main.data.datasource.SignInDataSource
import com.teamone.hackathon.main.data.datasource.SignInDataSource.Remote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class SignInDataModule {

    @Provides
    fun providesSignInRepository(
        remoteDataSource: SignInDataSource.Remote
    ): SignInRepository = SignInRepository.apply {
        signInRemoteDataSource = remoteDataSource
    }

    @Provides
    fun providesSignInRemoteDataSource(signInDataSource: LoginDataSource): Remote =
        signInDataSource

}