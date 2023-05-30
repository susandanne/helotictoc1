package com.example.helotictoc1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import com.example.helotictoc1.R.id.image

class MainActivity : AppCompatActivity() {
lateinit var img:ImageView
lateinit var txt:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt=findViewById(R.id.txt)
        img=findViewById(R.id.image)
        img.translationY=-1000f
       txt.translationY=-1000f
        img.animate().translationY(0f).duration=2000
        txt.animate().translationY(0f).duration=2000
     Handler(Looper.getMainLooper()).postDelayed({
         var intent=Intent(this,StartActivity2::class.java)
         startActivity(intent)
     },3000)

    }
}