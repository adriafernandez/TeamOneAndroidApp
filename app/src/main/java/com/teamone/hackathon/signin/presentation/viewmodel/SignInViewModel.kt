package com.teamone.hackathon.signin.presentation.viewmodel

import android.media.session.MediaSession.Token
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.signin.domain.model.SignInDomainLayerContract.PresentationLayer.UseCase.LoginUser
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

class SignInViewModel @Inject constructor(
    val loginUser: LoginUser
) : ViewModel() {


}