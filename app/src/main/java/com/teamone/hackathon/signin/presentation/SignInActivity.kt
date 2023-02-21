package com.teamone.hackathon.signin.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teamone.hackathon.databinding.ActivitySignInBinding
import com.teamone.hackathon.signin.presentation.SignInContract.Presenter
import com.teamone.hackathon.signin.presentation.SignInContract.View
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignInActivity : AppCompatActivity(), View {

    @Inject
    lateinit var presenter: Presenter
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        TODO("Not yet implemented")
    }
}