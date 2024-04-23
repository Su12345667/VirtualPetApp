package com.example.virtualpet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        private var Happiness  = 100
        private var Hunger = 0
        private var Cleanliness = 100

        val feedBtn = findViewById<Button>(R.id.feedBtn)
        val playBtn =findViewById<Button>(R.id.playBtn)
        val cleanBtn = findViewById<Button>(R.id.cleanBtn)
        val imageView = findViewById<ImageView>(R.id.imageView)

        playBtn.setOnClickListener {
            playWithPet()
            imageView.setImageResource(R.drawable.img_5)
        }
        feedBtn.setOnClickListener {
            feedPet()
            imageView.setImageResource(R.drawable.img_3)
        }
        cleanBtn.setOnClickListener {
            cleanPet()
            imageView.setImageResource(R.drawable.img_4)
        }


    }
}