package com.teamone.hackathon.signin.presentation.di

import android.app.Activity
import com.teamone.hackathon.main.presentation.ui.MainActivity
import com.teamone.hackathon.signin.presentation.ui.SignInActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class SignInPresentationDependencies() {

    @Provides
    fun providesSignInView(activity: Activity): SignInActivity =
        activity as SignInActivity
}