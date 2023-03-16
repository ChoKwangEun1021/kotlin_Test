package com.example.androidfirst

import android.os.Bundle
import android.text.InputType
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidfirst.databinding.ActivityMain10Binding
import com.example.androidfirst.databinding.ActivitySub13Binding
import com.example.androidfirst.databinding.ActivitySub15Binding
import com.example.androidfirst.databinding.ActivitySub16Binding

class MainActivity10 : AppCompatActivity() {
    lateinit var binding: ActivityMain10Binding
    lateinit var binding2: ActivitySub13Binding
    lateinit var binding3: ActivitySub15Binding
    lateinit var binding4: ActivitySub16Binding
    var flag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain10Binding.inflate(layoutInflater)
        binding2 = ActivitySub13Binding.inflate(layoutInflater)
        binding3 = ActivitySub15Binding.inflate(layoutInflater)
        binding4 = ActivitySub16Binding.inflate(layoutInflater)
        setContentView(binding4.root)

        binding4.edtPassword.setOnClickListener{
            binding4.edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_NORMAL
            Toast.makeText(applicationContext,binding4.edtPassword.text.toString(),Toast.LENGTH_SHORT).show()
        }

//        binding2.btnClick.setOnClickListener {
//            if (flag == true){
//                binding2.btnTarget.visibility = View.VISIBLE
//                binding2.btnGone.visibility = View.VISIBLE
//                flag = false
//            }else{
//                binding2.btnTarget.visibility = View.INVISIBLE
//                binding2.btnGone.visibility = View.GONE
//                flag = true
//            }
//        }
    }
}