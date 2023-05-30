package com.example.helotictoc1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class GameActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game2)

    }
    fun btnclick(view:View){
        var cellId=0
        val buselected=view as Button
        when(buselected.id){
            R.id.bu1->cellId=1
            R.id.bu2->cellId=2
            R.id.bu3->cellId=3
            R.id.bu4->cellId=4
            R.id.bu5->cellId=5
            R.id.bu6->cellId=6
            R.id.bu7->cellId=7
            R.id.bu8->cellId=8
            R.id.bu9->cellId=9

        }
        Log.d("data",cellId.toString())
    }
}