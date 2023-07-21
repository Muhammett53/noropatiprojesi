package com.muhammet.noropatiprojesi

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.muhammet.noropatiprojesi.databinding.ActivitySplashScreenBinding

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    private val splashScreen = 10000
    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animasyon1 = AnimationUtils.loadAnimation(this, R.anim.animasyon1)
        val animasyon2 = AnimationUtils.loadAnimation(this, R.anim.animasyon2)
        val animasyon3 = AnimationUtils.loadAnimation(this, R.anim.animasyon3)

        val imageView = binding.imageView
        val imageView2 = binding.imageView2
        val baslik = binding.textView
        imageView.animation = animasyon1
        imageView2.animation = animasyon2
        baslik.animation = animasyon3

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }, splashScreen.toLong())

    }
}