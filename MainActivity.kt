package com.example.bluetoothtest

import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.InputDevice.ViewBehavior
import android.view.InputEvent
import android.view.MotionEvent
import android.view.InputDevice


private val MainActivity.InputDevice.Companion.SOURCE_JOYSTICK: Int
    get() {
        val i = 0
        return i
    }

class MainActivity : AppCompatActivity() {

    private lateinit var bingus: TextView
    private lateinit var bingus2: TextView


    abstract class InputDevice : Parcelable {
        companion object
    }


    //abstract class MotionEvent : InputEvent, Parcelable {
    // }

    override fun onGenericMotionEvent(event: android.view.MotionEvent): Boolean {

        if (event.source and InputDevice.SOURCE_JOYSTICK == InputDevice.SOURCE_JOYSTICK && event.action == android.view.MotionEvent.ACTION_MOVE) {
            val x = event.getAxisValue(android.view.MotionEvent.AXIS_X)
            val y = event.getAxisValue(android.view.MotionEvent.AXIS_Y)

            setContentView(R.layout.activity_main)
            setContentView(R.layout.activity_main)
            bingus2 = findViewById(R.id.tv3)
            bingus = findViewById(R.id.tv2)
            bingus2.text = "y: "+ y.toString()//y axis value
            bingus.text = "x: "+ x.toString()//this is displaying the value in the xml
            return true
        }

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()

            var value = 10//this is the value that you are displaying

        }
        return super.onGenericMotionEvent(event)
    }
}