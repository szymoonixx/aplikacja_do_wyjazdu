package com.example.zadanie1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data_w=findViewById<TextView>(R.id.wyjazdD)
        var data_p=findViewById<TextView>(R.id.powrotD)
        var oblicz=findViewById<Button>(R.id.obliczanie)
        var ilosc=findViewById<TextView>(R.id.ilosc)
        oblicz.setOnClickListener {
            var i=data_p.text.toString().toInt()-data_w.text.toString().toInt()
            ilosc.text = "Ilosc dni: " + i.toString()
        }

    }
}