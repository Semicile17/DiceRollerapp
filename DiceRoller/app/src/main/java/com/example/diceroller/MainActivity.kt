package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbut = findViewById<Button>(R.id.button)
        val disptext=findViewById<TextView>(R.id.textView)
        rollbut.setOnClickListener() {
            disptext.visibility = View.GONE
            rollDice()
        }


    }

        private fun rollDice(){

            val `drawable-resource` = when(Random().nextInt(6)+1){
                1-> R.drawable.dice_1
                2->R.drawable.dice_2
                3->R.drawable.dice_3
                4->R.drawable.dice_4
                5->R.drawable.dice_5
                else->R.drawable.dice_6


            }
            val diceimage= findViewById<ImageView>(R.id.imageView)
            diceimage.setImageResource(`drawable-resource`)
        }
    }


