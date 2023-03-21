package com.example.androidfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import com.example.androidfirst.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ckbClick.setOnCheckedChangeListener(this)
        binding.ckbClick2.setOnCheckedChangeListener(this)

        binding.ckbClick3.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                Toast.makeText(applicationContext,"3번",Toast.LENGTH_SHORT).show()
            }

        })

        binding.ckbClick4.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(applicationContext,"4번",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView?.id){
            R.id.ckbClick -> {
                Toast.makeText(applicationContext,"1번",Toast.LENGTH_SHORT).show()
            }
            R.id.ckbClick2 -> {
                Toast.makeText(applicationContext,"2번",Toast.LENGTH_SHORT).show()
            }else -> null
        }
    }


}