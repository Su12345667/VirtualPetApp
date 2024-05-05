package com.example.virtualpet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
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
    var health = 100
    var hunger = 0
    var cleanliness = 100
    fun updateStatusText() {}

    fun feedPet() {
        hunger = 20
        if (hunger > 0) hunger = 0
        health += 10
        if (health > 100) health = 100
        updateStatusText()
    }


    fun cleanPet() {
        cleanliness = 100
        health += 10
        if (health > 100) health = 100
        updateStatusText()
    }

    fun playWithPet() {
        health -= 15
        if (health > 0) health = 0
        hunger += 15
        if (hunger > 100) hunger = 100
        updateStatusText()
    }
}
