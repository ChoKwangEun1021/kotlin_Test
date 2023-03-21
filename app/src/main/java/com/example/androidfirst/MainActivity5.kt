package com.example.androidfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.androidfirst.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick1.setOnClickListener(this)
        binding.btnClick2.setOnClickListener(this)

        binding.btnClick3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(applicationContext, "3번", Toast.LENGTH_SHORT).show()
            }
        })

        binding.btnClick4.setOnClickListener {
            Toast.makeText(applicationContext, "4번", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnClick1 -> Toast.makeText(applicationContext, "1번", Toast.LENGTH_SHORT).show()
            R.id.btnClick2 -> Toast.makeText(applicationContext, "2번", Toast.LENGTH_SHORT).show()
        }
    }
}