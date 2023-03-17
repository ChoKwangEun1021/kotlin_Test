package com.example.androidfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Toast
import com.example.androidfirst.databinding.ActivityMain3Binding
import kotlin.math.log

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_DOWN -> {
                Toast.makeText(applicationContext,"터치를 클릭하였습니다.", Toast.LENGTH_SHORT).show()
                Log.d("MainActivity3", "터치를 클릭 x = ${event?.x} rawx = ${event?.rawX}" + "y = ${event?.y} rawy = ${event?.rawY}")
            }
            MotionEvent.ACTION_UP -> {
                Toast.makeText(applicationContext,"터치를 클릭해제했습니다.", Toast.LENGTH_SHORT).show()
                Log.d("MainActivity3", "터치를 클릭해제했습니다.")
            }
        }
        return super.onTouchEvent(event)
    }
}