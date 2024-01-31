package com.example.civkadebil

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.view.WindowManager
import com.example.civkadebil.databinding.ActivityFirstScreenBinding
import com.example.civkadebil.databinding.ActivityMenuBinding


class FirstScreen : AppCompatActivity() {

    lateinit var binding : ActivityFirstScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dm = DisplayMetrics()
        windowManager.defaultDisplay.getRealMetrics(dm)
        MainActivity.GAME_WIDTH = dm.widthPixels
        MainActivity.GAME_HEIGHT = dm.heightPixels
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            window.attributes.layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES
        }
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.startButton.setOnClickListener{
        val Intent = Intent(this, Menu:: class.java)
        startActivity(Intent)
            }
        }

    }
