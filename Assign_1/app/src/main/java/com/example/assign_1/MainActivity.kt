package com.example.assign_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the button and text view in the layout
        val trueButton = findViewById<Button>(R.id.truebutton)
        val textViewStatus = findViewById<TextView>(R.id.text_view_status)

        // Set up a click listener for the button to change the text view's text
        trueButton.setOnClickListener {
            textViewStatus.text = getString(R.string.hello_world)
        }
    }
}