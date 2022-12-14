package com.example.zadanie1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.time.Duration.Companion.days

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var wyjazd=0
        var powrot=2
        var oblicz=findViewById<Button>(R.id.obliczanie)
        var ilosc=findViewById<TextView>(R.id.ilosc)
        var data_w=findViewById<Button>(R.id.Wyjazd)
        var data_p=findViewById<Button>(R.id.powrot)
        var kalendarz=findViewById<CalendarView>(R.id.calendarView)

        data_w.setOnClickListener {
            wyjazd = kalendarz.date.days.toString().toInt()
        }
        data_p.setOnClickListener {
            powrot = kalendarz.date.days.toString().toInt()

        }

        oblicz.setOnClickListener {
            var suma =powrot-wyjazd
            ilosc.text = "Ilosc dni: "+ suma.toString()
        }

    }
}