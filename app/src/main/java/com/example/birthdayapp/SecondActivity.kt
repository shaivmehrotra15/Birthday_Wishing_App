package com.example.birthdayapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdayapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent.getStringExtra("EXTRA_NAME")
//        val name = intent.toString()
        binding.tvDisplayName.text = "Happy Birthday $intent"
    }
}