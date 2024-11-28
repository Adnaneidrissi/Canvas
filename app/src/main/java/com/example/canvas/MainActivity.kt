package com.example.canvas

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var circleView: CircleView
    private lateinit var upButton: Button
    private lateinit var downButton: Button
    private lateinit var leftButton: Button
    private lateinit var rightButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circleView = findViewById(R.id.circleView)
        upButton = findViewById(R.id.upButton)
        downButton = findViewById(R.id.downButton)
        leftButton = findViewById(R.id.leftButton)
        rightButton = findViewById(R.id.rightButton)

        upButton.setOnClickListener {
            circleView.moveUp()
        }

        downButton.setOnClickListener {
            circleView.moveDown()
        }

        leftButton.setOnClickListener {
            circleView.moveLeft()
        }

        rightButton.setOnClickListener {
            circleView.moveRight()
        }
    }
}
