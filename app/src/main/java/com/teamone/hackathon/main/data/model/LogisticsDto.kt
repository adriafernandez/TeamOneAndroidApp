package com.teamone.hackathon.main.data.model

data class LogisticsDto(
    val results: List<LogisticDto>
)

data class LogisticDto(
    val day: String,
    val hour: Int,
    val handling_function: String,
    val full_time_employees: Int,
    val part_time_employees: Int,
    val total_employees: Int,
    val full_time_employees_cost: Int,
    val part_time_employees_cost: Int,
    val total_cost: Int
)