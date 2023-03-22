package com.example.androidfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.example.androidfirst.databinding.ActivityMain7Binding

class MainActivity7 : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityMain7Binding
    var pauseTime = 0L
    var initTime = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.tvMessage.text = getString(R.string.app_btn_start)
                binding.tvMessage.textSize = resources.getDimension(R.dimen.txt_size_large)
                binding.tvMessage.setTextColor(ResourcesCompat.getColor(resources,R.color.txt_color2, null))
                binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
                binding.chronometer.start()
                binding.btnStart.isEnabled = false
                binding.btnStop.isEnabled = true
                binding.btnReset.isEnabled = true
            }
        })
        binding.btnStop.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.tvMessage.text = getString(R.string.app_btn_stop)
                binding.tvMessage.textSize = resources.getDimension(R.dimen.txt_size_small)
                binding.tvMessage.setTextColor(ResourcesCompat.getColor(resources,R.color.txt_color, null))
                pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
                binding.chronometer.stop()
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = true
            }
        })
        binding.btnReset.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.tvMessage.text = getString(R.string.app_btn_reset)
                binding.tvMessage.textSize = resources.getDimension(R.dimen.txt_size_medium)
                binding.chronometer.base = SystemClock.elapsedRealtime()
                pauseTime = 0L
                binding.chronometer.stop()
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = false
            }
        })
    }

    //백버튼을 가져올려고 한다. (볼륨조절, 전원, 백버튼튼)
//    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            if (System.currentTimeMillis() - initTime > 3000) {
//                Toast.makeText(this@MainActivity7, "종료하려면 3초이내 단번 더 누르시오", Toast.LENGTH_SHORT).show()
//                initTime = System.currentTimeMillis()
//                return true
//            }
//        }
//        return super.onKeyDown(keyCode, event)
//    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - initTime > 3000) {
            Toast.makeText(this@MainActivity7, getString(R.string.app_btn_back), Toast.LENGTH_SHORT).show()
            initTime = System.currentTimeMillis()
        }else{
            super.onBackPressed()
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnStart -> {
                binding.tvMessage.text = getString(R.string.app_btn_start)
                binding.chronometer.base = SystemClock.elapsedRealtime() + pauseTime
                binding.chronometer.start()
                binding.btnStart.isEnabled = false
                binding.btnStop.isEnabled = true
                binding.btnReset.isEnabled = true
            }
            R.id.btnStop -> {
                binding.tvMessage.text = getString(R.string.app_btn_stop)
                pauseTime = binding.chronometer.base - SystemClock.elapsedRealtime()
                binding.chronometer.stop()
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = true
            }
            R.id.btnReset -> {
                binding.tvMessage.text = getString(R.string.app_btn_reset)
                binding.chronometer.base = SystemClock.elapsedRealtime()
                binding.chronometer.stop()
                pauseTime = 0L
                binding.btnStart.isEnabled = true
                binding.btnStop.isEnabled = false
                binding.btnReset.isEnabled = false
            }
            else -> null
        }
    }
}