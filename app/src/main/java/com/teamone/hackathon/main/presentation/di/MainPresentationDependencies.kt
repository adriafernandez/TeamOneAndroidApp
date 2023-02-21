package com.teamone.hackathon.main.presentation.di

import android.app.Activity
import com.teamone.hackathon.main.presentation.ui.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class MainPresentationDependencies() {

    @Provides
    fun providesMainView(activity: Activity): MainActivity =
        activity as MainActivity
}