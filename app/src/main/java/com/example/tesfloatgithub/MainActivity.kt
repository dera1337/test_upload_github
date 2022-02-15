package com.example.tesfloatgithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tesfloatgithub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = Users(
            listOf(
                User (
                    "Yoris",
                    "yor@asd.com",
                    "pria",
                    false
                ),
                User (
                    "Yoris",
                    "yor@asd.com",
                    "pria",
                    false
                ),
                User (
                    "Yoris",
                    "yor@asd.com",
                    "pria",
                    false
                )
            )
        )
        binding.apply {
            btnMoveActivity.setOnClickListener{
                var intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("INI DATA BARU", data)
                startActivity(intent)
                finish()
            }
        }
    }
}