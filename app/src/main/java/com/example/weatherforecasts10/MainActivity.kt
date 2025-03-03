package com.example.weatherforecasts10

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate
import java.time.DayOfWeek
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.rvDayForecast)
        val dayList = mutableListOf<Day>()
        for (i in 0..10) {
            var date = LocalDate.now().plusDays(i.toLong())
            var dayOfWeek = date.dayOfWeek.toString()
            var day = Day(date.toString(), dayOfWeek, Random.nextBoolean(), Random.nextInt(-10, 31))
            dayList.add(day)
        }
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = DayAdapter(dayList)
    }

}