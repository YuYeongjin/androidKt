package com.example.ch9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.example.ch9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.imageView.setImageDrawable(ResourcesCompat.getDrawable(resources,
        android.R.drawable.alert_dark_frame,null))
        binding.textView.text =getString(android.R.string.emptyPhoneNumber)

        setContentView(R.layout.activity_main)
    }
}