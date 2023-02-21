package com.teamone.hackathon.signin.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teamone.hackathon.databinding.ActivitySignInBinding
import com.teamone.hackathon.main.presentation.ui.MainActivity

class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.signInButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}