package com.example.weatherforecasts10

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.rvDayForecast)
        val dayList = listOf(
            Day("28.02.2025", "Пятница", true, -5),
            Day("29.02.2025", "Суббота", false, 15),
            Day("30.02.2025", "Воскресенье", true, -9),
            Day("31.02.2025", "Понедельник", false, 27),
        )
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = DayAdapter(dayList)
    }
}