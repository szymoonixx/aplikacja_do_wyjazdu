package com.example.zadanie1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dayw =0
        var monthw =0
        var yearw =0

        var dayp =0
        var monthp=0
        var yearp =0
        var oblicz = findViewById<Button>(R.id.obliczanie)
        var ilosc = findViewById<TextView>(R.id.ilosc)
        var data_w = findViewById<Button>(R.id.Wyjazd)
        var data_p = findViewById<Button>(R.id.powrot)
        var kalendarz = findViewById<CalendarView>(R.id.calendarView)
        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        calendarView.setMinDate(System.currentTimeMillis() - 1000);

        data_w.setOnClickListener {
            calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
                monthw = month + 1
                dayw = (dayOfMonth.toInt())
                yearw = year
            }
        }
        data_p.setOnClickListener {
            calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
                monthp = month + 1
                dayp =(dayOfMonth.toInt())
                yearp = year

            }
        }
        oblicz.setOnClickListener{

            if (dayp<dayw)
            {
                ilosc.text="data powrotu jest mniejsza od daty wujazdu"
            }
            else
            {
                var sumw=dayw.toString().toInt()+monthw.toString().toInt()+yearw.toString().toInt()
                var sump=dayp.toString().toInt()+monthp.toString().toInt()+yearp.toString().toInt()
                var sum = sump-sumw
                ilosc.text="Ilosc dni: "+ sum

            }

        }
    }
}