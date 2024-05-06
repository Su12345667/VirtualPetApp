package com.example.virtualpet

import android.annotation.SuppressLint
import android.graphics.drawable.AnimatedImageDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView

class MainActivity2 : AppCompatActivity() {
    private var health = 100
    private var hunger = 0
    private var cleanliness = 100
    lateinit var feedtxt : TextView
    lateinit var healthtxt : TextView
    lateinit var cleantxt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        feedtxt = findViewById(R.id.hunger)
        healthtxt = findViewById(R.id.health)
        cleantxt = findViewById(R.id.cleanliness)
        val feedBtn = findViewById<Button>(R.id.feedBtn)
        val playBtn = findViewById<Button>(R.id.playBtn)
        val cleanBtn = findViewById<Button>(R.id.cleanBtn)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val exitBtn = findViewById<Button>(R.id.exitBtn)

        fun updateStatusText() {
            healthtxt.text = "Health - $health"
            feedtxt.text = "Hunger - $hunger"
            cleantxt.text = "Cleanliness - $cleanliness"
        }

        fun feedPet() {
            hunger = 20
            if (hunger > 0) hunger -= 20
            health += 10
            if (health > 100) health = 100
            updateStatusText()
        }


        fun cleanPet() {
            cleanliness += 10
            health += 10
            if (health > 100) health = 100
            updateStatusText()
        }

        fun playWithPet() {
            health -= 15
            if (health > 100) health = 100
            hunger += 15
            if (hunger > 100) hunger = 100
            cleanliness -= 10
            if (cleanliness > 100) cleanliness = 100
            updateStatusText()
        }

        playBtn.setOnClickListener {
            playWithPet()
            imageView.setImageResource(R.drawable.img)
        }
        feedBtn.setOnClickListener {
            feedPet()
            imageView.setImageResource(R.drawable.img_6)
        }
        cleanBtn.setOnClickListener {
            cleanPet()
            imageView.setImageResource(R.drawable.img_7 )
        }
        exitBtn.setOnClickListener {
            finish()
        }
    }
}


