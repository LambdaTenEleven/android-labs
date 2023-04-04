package com.epslilonlabs.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textHello)
        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")

        textView.text = "Hello, $name $surname!"
    }
}