package com.muhammet.noropatiprojesi

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.muhammet.noropatiprojesi.databinding.ActivityMainBinding

class kayitAlma : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }



    fun kayitOl(view: View) {
        val intent = Intent(this, kayitAlma::class.java)
        startActivity(intent)
    }
}