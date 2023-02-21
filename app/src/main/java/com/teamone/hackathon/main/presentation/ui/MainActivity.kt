package com.teamone.hackathon.main.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.teamone.hackathon.databinding.ActivityMainBinding
import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.main.presentation.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainViewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    fun loadLogistics(data: Logistics) {
        (binding.rvLogistic.adapter as LogisticsAdapter).updateData(newData = data.results)
    }

    fun initViews() {
        with(binding.rvLogistic) {
            this.layoutManager = LinearLayoutManager(context)
            this.adapter = LogisticsAdapter()
        }
        lifecycleScope.launch {
            mainViewModel.fetchLogisticsData()
            mainViewModel.logistics.collect { logistics ->
                if (logistics != null) { loadLogistics(data = logistics) }
            }
        }
        binding.searchButton.setOnClickListener {
            lifecycleScope.launch {
                mainViewModel.fetchLogisticsDataByDate(
                    binding.tieFirstDate.toString(),
                    binding.tieSecondDate.toString()
                )
                mainViewModel.logistics.collect { logistics ->
                    if (logistics != null) { loadLogistics(data = logistics) }
                }
            }
        }
    }
}