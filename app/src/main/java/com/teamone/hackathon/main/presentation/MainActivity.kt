package com.teamone.hackathon.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teamone.hackathon.databinding.ActivityMainBinding
import com.teamone.hackathon.main.presentation.MainContract.Presenter
import com.teamone.hackathon.main.presentation.MainContract.View
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), View {

    @Inject
    lateinit var presenter: Presenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        TODO("Not yet implemented")
    }
}