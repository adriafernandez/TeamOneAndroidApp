package com.teamone.hackathon.main.presentation

import com.teamone.hackathon.main.presentation.MainContract.Presenter
import com.teamone.hackathon.main.presentation.MainContract.View
import javax.inject.Inject

class MainPresenter @Inject constructor(
    var view: View
) : Presenter {

}