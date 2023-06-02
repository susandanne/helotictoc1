package com.example.helotictoc1

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button

class GameActivity2 : AppCompatActivity() {
    private val dialog=Dialog(this)
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
        playGameonreal(cellId,buselected)
//        Log.d("data : cellid",cellId.toString())
        checkwinner()
    }
     var activeplayer=1
     var player1=ArrayList<Int>()
     var player2=ArrayList<Int>()
    fun playGameonreal(cellid: Int,buselected: Button){
     if(activeplayer==1){
         buselected.text="X"
         buselected.setBackgroundResource(R.drawable.plaground)
         player1.add(cellid)
         activeplayer=2
     }
        else{
         buselected.text="o"
         buselected.setBackgroundResource(R.drawable.playground2)
         player2.add(cellid)
         activeplayer=1
        }
    }
    fun checkwinner(){
        var winner=-1

//        row1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
        winner=1
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner=2
        }
//        row2
        if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner=1
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner=2
        }
        //        row3
        if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner=2
        }
        //        col1
        if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner=2
        }
        //        col2
        if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner=1
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner=2
        }
        //        col3
        if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner=2
        }
        //        / top to bottom left
        if(player1.contains(3) && player1.contains(5) && player1.contains(7)){
            winner=1
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)){
            winner=2
        }
        //        / top to bottom right
        if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
            winner=1
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)){
            winner=2
        }
        if (winner==1){

            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.winner_dialogue_box)

            dialog.show()

        }
      else if (winner==2){
            val dialog=Dialog(this)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(false)
            dialog.setContentView(R.layout.winner_dialogue_box)

            dialog.show()
        }

//        if (winner==1){
//            Toast.makeText(this,"palyer 1 win the game",Toast.LENGTH_LONG).show()
//        }
//        else if (winner==2){
//            Toast.makeText(this,"player 2 win the game",Toast.LENGTH_SHORT).show()
//        }


    }
}