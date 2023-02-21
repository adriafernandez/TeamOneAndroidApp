package com.teamone.hackathon.signin.presentation.di

import android.app.Activity
import com.teamone.hackathon.signin.presentation.SignInActivity
import com.teamone.hackathon.signin.presentation.SignInContract
import com.teamone.hackathon.signin.presentation.SignInPresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class SignInPresentationModule() {

    @Provides
    fun providesSignInView(activity: Activity): SignInContract.View =
        activity as SignInActivity

    @Provides
    fun providesSignInPresenter(signInPresenter: SignInPresenter): SignInContract.Presenter =
        signInPresenter

}