package com.teamone.hackathon.main.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teamone.hackathon.main.domain.model.Logistics
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.PresentationLayer.UseCase.GetAllLogistics
import com.teamone.hackathon.main.domain.model.LogisticsDomainLayerContract.PresentationLayer.UseCase.GetLogisticsByDate
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val getAllLogisticsUc: GetAllLogistics,
    val getLogisticsByDateUc: GetLogisticsByDate
) : ViewModel() {

    val logistics: StateFlow<Logistics?>
        get() = _logistics.asStateFlow()

    private var _logistics: MutableStateFlow<Logistics?> = MutableStateFlow(null)

    fun fetchLogisticsData() {
        viewModelScope.launch {
            getAllLogisticsUc.getAllLogistics().onSuccess { logistics ->
                _logistics.update { logistics }
                println(_logistics)
            }.onFailure { error ->
                error.printStackTrace()
            }
        }
    }

    fun fetchLogisticsDataByDate(date1: String, date2: String) {
        viewModelScope.launch {
            getLogisticsByDateUc.getLogisticsByDate(date1, date2).onSuccess { logistics ->
                _logistics.update { logistics }
                println(_logistics)
            }.onFailure { error ->
                error.printStackTrace()
            }
        }
    }
}