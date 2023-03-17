package com.example.androidfirst

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.*

class MainActivity10 : AppCompatActivity() {
    lateinit var binding: ActivitySub23Binding
    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySub23Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSelect1.setOnClickListener {
            if (flag){
            binding.screenOne.visibility = View.VISIBLE
            binding.screenTwo.visibility = View.INVISIBLE
                flag = false
            }else {
            binding.screenOne.visibility = View.INVISIBLE
            binding.screenTwo.visibility = View.VISIBLE
                flag = true
            }
        }

        //FrameLayout -> LinerLayout 1번화면
        binding.impPictureOne.setOnClickListener {
            Toast.makeText(this,"1번화면입니다",Toast.LENGTH_SHORT).show()
        }
        //FrameLayout -> LinerLayout 1번화면
        binding.impPictureTwo.setOnClickListener {
            Toast.makeText(this,"2번화면입니다",Toast.LENGTH_SHORT).show()
        }
    }
}