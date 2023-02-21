package com.adriafernandez.exam_adriafernandez.common

import com.teamone.hackathon.main.data.model.LogisticDto
import com.teamone.hackathon.main.data.model.LogisticsDto
import com.teamone.hackathon.main.domain.model.Logistic
import com.teamone.hackathon.main.domain.model.Logistics

var id: Int = 1

//NULLS CONST VAL
private const val DEFAULT_STRING_CONST = "Null"
private const val DEFAULT_INT_CONST = 0

fun LogisticsDto?.toLogistics(): Logistics =
    Logistics(results = this?.results?.toLogisticList() ?: emptyList())

fun List<LogisticDto>.toLogisticList(): List<Logistic> =
    this.map { dto ->
        with(dto) {
            Logistic(
                day = day,
                hour = hour,
                handling_function = handling_function,
                full_time_employees = full_time_employees,
                part_time_employees = part_time_employees,
                total_employees = total_employees,
                full_time_employees_cost = full_time_employees_cost,
                part_time_employees_cost = part_time_employees_cost,
                total_cost = total_cost
            )
        }
    }



