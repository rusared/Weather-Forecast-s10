package com.example.weatherforecasts10

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.time.DayOfWeek
import java.time.LocalDate

class DayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val dateTextView: TextView = itemView.findViewById(R.id.tvDate)
    private val dayOfWeekTextView: TextView = itemView.findViewById(R.id.tvDayOfWeek)
    private val cloudCoverImageView: ImageView = itemView.findViewById(R.id.ivCloudCover)
    private val temperatureTextView: TextView = itemView.findViewById(R.id.tvTemperature)

    fun bind(day: Day) {
        dateTextView.text = day.date
        dayOfWeekTextView.text = day.dayOfWeek
        cloudCoverImageView.setImageResource(
            if (day.cloudCover) {
                R.drawable.baseline_cloud_24
            } else {
                R.drawable.baseline_wb_sunny_24
            }
        )
        temperatureTextView.text = day.temperature.toString()
    }
}