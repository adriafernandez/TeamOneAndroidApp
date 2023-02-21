package com.teamone.hackathon.main.presentation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.teamone.hackathon.R
import com.teamone.hackathon.main.domain.model.Logistic

class LogisticsAdapter(
    private val data: MutableList<Logistic> = mutableListOf()
) : RecyclerView.Adapter<LogisticsAdapter.LogisticsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LogisticsViewHolder {
        val rootView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.logistic_adapter_row, parent, false)
        return LogisticsViewHolder(itemView = rootView)
    }

    override fun onBindViewHolder(holder: LogisticsViewHolder, position: Int) {
        holder.bindData(data[position])

    }

    override fun getItemCount(): Int = data.size

    fun updateData(newData: List<Logistic>) {
        data.addAll(newData.toMutableList())
        notifyDataSetChanged()
    }

    inner class LogisticsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val hour: TextView by lazy { itemView.findViewById(R.id.hourTextView) }
        private val date: TextView by lazy { itemView.findViewById(R.id.dateTextView) }
        private val handlingFunctions: TextView by lazy { itemView.findViewById(R.id.handlingFunctionsTextView) }
        private val fullTimeEmployees: TextView by lazy { itemView.findViewById(R.id.fullTimeEmployeesTextView) }
        private val partTimeEmployees: TextView by lazy { itemView.findViewById(R.id.partTimeEmployeesTextView) }
        private val totalEmployees: TextView by lazy { itemView.findViewById(R.id.totalEmployeesTextView) }
        private val fullTimeEmployeesCost: TextView by lazy { itemView.findViewById(R.id.fullTimeEmployeesCostTextView) }
        private val partTimeEmployeesCost: TextView by lazy { itemView.findViewById(R.id.partTimeEmployeesCostTextView) }
        private val totalCost: TextView by lazy { itemView.findViewById(R.id.totalCostTextView) }

        fun bindData(logistic: Logistic) {
            hour.text = logistic.hour.toString()
            date.text = logistic.day
            handlingFunctions.text = logistic.handling_function
            fullTimeEmployees.text = logistic.full_time_employees.toString()
            partTimeEmployees.text = logistic.part_time_employees.toString()
            totalEmployees.text = logistic.total_employees.toString()
            fullTimeEmployeesCost.text = logistic.full_time_employees_cost.toString()
            partTimeEmployeesCost.text = logistic.part_time_employees_cost.toString()
            totalCost.text = logistic.total_cost.toString()
        }

    }

}


