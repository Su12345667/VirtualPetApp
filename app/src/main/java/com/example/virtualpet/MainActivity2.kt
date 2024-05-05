package com.example.virtualpet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val feedBtn = findViewById<Button>(R.id.feedBtn)
        val playBtn = findViewById<Button>(R.id.playBtn)
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
    private var health = 100
    private var hunger = 0
    private  var cleanliness = 100

    fun updateStatusText() {}

    fun feedPet() {
        hunger = 20
        if (hunger > 0) hunger = 0
        health += 10
        if (health > 100) health = 100
        updateStatusText()
    }


        private fun cleanPet() {
            cleanliness = 100
            health += 10
            if (health > 100) health = 100
            updateStatusText()
        }

        private fun playWithPet() {
            health -= 15
            if (health > 0) health = 0
            hunger += 15
            if (hunger > 100) hunger = 100
            updateStatusText()
        }
        }
