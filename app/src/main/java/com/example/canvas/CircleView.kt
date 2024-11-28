package com.example.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var circleX = 500f
    private var circleY = 500f
    private val radius = 100f
    private var screenHeight = 0f
    private var screenWidth = 0f

    private val paint = Paint().apply {
        color = Color.RED
        isAntiAlias = true
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        screenWidth = w.toFloat()
        screenHeight = h.toFloat()

        // Position initiale du cercle : centre de l'écran
        circleX = screenWidth / 2
        circleY = screenHeight / 2
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawCircle(circleX, circleY, radius, paint)
    }

    fun moveUp() {
        if (circleY - radius > 0) {
            circleY -= 50f
        }
        invalidate()
    }

    fun moveDown() {
        if (circleY + radius < screenHeight) {
            circleY += 50f
        }
        invalidate()
    }

    fun moveLeft() {
        if (circleX - radius > 0) {
            circleX -= 50f
        }
        invalidate()
    }

    fun moveRight() {
        if (circleX + radius < screenWidth) {
            circleX += 50f
        }
        invalidate()
    }
}
