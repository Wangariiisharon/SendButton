package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnSend:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi= findViewById(R.id.btnBmi)
        btnBmi.setOnClickListener {
            val intent=Intent(this, calculateBmiActivity::class.java)
            startActivity(intent)
        }
        btnSend= findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            val intent=Intent(this, sendActivity::class.java)
            startActivity(intent)
        }
    }
}