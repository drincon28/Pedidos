package com.uan.pedidos

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    private val splashDur = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        Looper.myLooper()?.let {
            Handler(it).postDelayed({
                val intent = Intent(this, ActivityDashboard::class.java)
                startActivity(intent)
                finish()
            }, splashDur.toLong())
        }
    }
}