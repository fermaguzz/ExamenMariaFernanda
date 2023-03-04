package com.example.examenmariafernanda
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configura los elementos del spinner
        val horarios = resources.getStringArray(R.array.horarios)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, horarios)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        horarios_spinner.adapter = adapter
    }
}

