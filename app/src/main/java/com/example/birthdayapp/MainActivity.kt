package com.example.birthdayapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.birthdayapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnSendName.setOnClickListener {

           val name = binding.etInputName.text.toString()

           Toast.makeText(this, name, Toast.LENGTH_SHORT).show()

           val intent = Intent(this,SecondActivity::class.java)
           intent.putExtra("EXTRA_NAME" , name)
           startActivity(intent)

       }

    }
}