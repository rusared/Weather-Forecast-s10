package com.example.weatherforecasts10

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.time.DayOfWeek
import java.time.LocalDate

class DayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val dateTextView: TextView = itemView.findViewById(R.id.tvDate)
    val dayOfWeekTextView: TextView = itemView.findViewById(R.id.tvDayOfWeek)
    val cloudCoverImageView: TextView = itemView.findViewById(R.id.ivCloudCover)
    val temperatureTextView: TextView = itemView.findViewById(R.id.tvTemperature)
}