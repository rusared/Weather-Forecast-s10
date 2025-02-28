package com.example.weatherforecasts10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DayAdapter(private val dayList: List<Day>) : RecyclerView.Adapter<DayViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.day_item, parent, false)
        return DayViewHolder(view)
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        val day = dayList[position]
        holder.dateTextView.text = day.date.toString()
        holder.dayOfWeekTextView.text = day.dayOfWeek.toString()
        holder.cloudCoverImageView. = day.cloudCover
        holder.temperatureTextView..setImageResource(R.drawable.ic_clear) = day.temperature.toString()
    }

    override fun getItemCount(): Int {
        return dayList.size
    }
}