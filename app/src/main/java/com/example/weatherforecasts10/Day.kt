package com.example.weatherforecasts10

import java.time.DayOfWeek
import java.time.LocalDate

data class Day (
    val date: LocalDate,
    val dayOfWeek: DayOfWeek,
    val cloudCover: Boolean,
    val temperature: Int
)