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
        var dni = findViewById<TextView>(R.id.dni)
        var miesiace = findViewById<TextView>(R.id.miesiace)
        var lata = findViewById<TextView>(R.id.lata)
        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        calendarView.setMinDate(System.currentTimeMillis() - 1000);

        data_w.setOnClickListener {
            calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
                monthw = month + 1
                dayw = (dayOfMonth.toInt())
                yearw = year
                dni.text=dayw.toString()
                miesiace.text=monthw.toString()
                lata.text=yearw.toString()
            }
        }
        data_p.setOnClickListener {
            calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
                monthp = month + 1
                dayp =(dayOfMonth.toInt())
                yearp = year
                dni.text=dayp.toString()
                miesiace.text=monthp.toString()
                lata.text=yearp.toString()
            }
        }
        oblicz.setOnClickListener{

            if (dayw>dayp)
            {
            }


            var sumw=dayw.toString().toInt()+monthw.toString().toInt()+yearw.toString().toInt()
            var sump=dayp.toString().toInt()+monthp.toString().toInt()+yearp.toString().toInt()
            var sum = sump-sumw
            ilosc.text="Ilosc dni: "+ sum+"//"+sumw+"/"+sump
        }
    }
}