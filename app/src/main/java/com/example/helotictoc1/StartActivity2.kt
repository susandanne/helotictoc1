package com.example.helotictoc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity2 : AppCompatActivity() {
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start2)

        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            var intent=Intent(this,GameActivity2::class.java)
            startActivity(intent)
        }
    }
}