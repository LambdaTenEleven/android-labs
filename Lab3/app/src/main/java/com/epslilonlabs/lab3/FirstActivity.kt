package com.epslilonlabs.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val editTextName = findViewById<TextInputEditText>(R.id.textFieldName)
        val editTextSurname = findViewById<TextInputEditText>(R.id.textFieldSurname)
        val button = findViewById<Button>(R.id.filledButton)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", editTextName.text.toString())
            intent.putExtra("surname", editTextSurname.text.toString())

            startActivity(intent)
        }
    }
}