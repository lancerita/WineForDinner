package com.example.winefordinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.winefordinner.data.WineRepositoryCurrent

class MainActivity : AppCompatActivity() {

    val choice = WineRepositoryCurrent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textResult = findViewById<TextView>(R.id.textResult)
        textResult.setText(choice.getchoiceWine().toString())
        Log.d("smth", choice.getchoiceWine().toString())
    }

}
