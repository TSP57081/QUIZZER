package com.example.quizzer

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var greeting = findViewById<TextView>(R.id.greeting)
        var sun_or_moon = findViewById<TextView>(R.id.sun_or_moon)

        val date = Date()
        val hour = date.hours
        var unicode = 0x2600
        var text : String = resources.getText(R.string.morning) as String
        if (hour <= 6 || hour > 19) {
            unicode = 0x1F31B
        }
        sun_or_moon.text = String(Character.toChars(unicode))

        if (hour > 12) {
            text = resources.getText(R.string.afternoon) as String
            if (hour >= 17) {
                text = resources.getText(R.string.evening) as String
            }
        }
        greeting.text = text
    }
}