package com.muhammet.noropatiprojesi


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.muhammet.noropatiprojesi.databinding.ActivityMainBinding


class arayuz : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}




