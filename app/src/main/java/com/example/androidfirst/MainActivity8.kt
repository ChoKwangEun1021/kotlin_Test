package com.example.androidfirst

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowMetrics
import com.example.androidfirst.databinding.ActivityMain8Binding

class MainActivity8 : AppCompatActivity() {
    lateinit var binding: ActivityMain8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //화면정보를 가져오는데 버전에 따라서 명령이 틀린다.API 30 버전부터 가져오는 방법이 다름
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            val windowMetrics: WindowMetrics = windowManager.currentWindowMetrics
            Log.e("MainActivity8", "width 30이상 : ${windowMetrics.bounds.width()}" +
                    "height : ${windowMetrics.bounds.height()}")
        }else{
            val display = windowManager.defaultDisplay
            val displayMetrics = DisplayMetrics()
            display?.getRealMetrics(displayMetrics)
            Log.e("MainActivity8", "width 30미만 : ${displayMetrics.widthPixels}" +
                    "height : ${displayMetrics.heightPixels}")
        }
    }//end of create
}
