package com.example.tesfloatgithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tesfloatgithub.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            var dataMainActivity = intent.getParcelableExtra<Users>("INI DATA BARU")
            btnBack.setOnClickListener{
                var intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            Log.i("Data", "$dataMainActivity")
        }
    }
}