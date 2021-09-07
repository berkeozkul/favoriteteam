package com.example.favoriteteam.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.favoriteteam.R

class FenerbahceHistory : AppCompatActivity() {
    lateinit var backbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fenerbahce_history)
    backbtn = findViewById(R.id.back_btn)

        backbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}