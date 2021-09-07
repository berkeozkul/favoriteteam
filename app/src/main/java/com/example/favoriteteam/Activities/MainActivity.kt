package com.example.favoriteteam.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.favoriteteam.R

class MainActivity : AppCompatActivity() {

    lateinit var historybtn : Button
    lateinit var fbfootballbtn : Button
    lateinit var fbbasketballbtn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        historybtn = findViewById(R.id.history_btn)
        fbfootballbtn =findViewById(R.id.fbfotball_btn)
        fbbasketballbtn = findViewById(R.id.fbbasketball_btn)

        historybtn.setOnClickListener {

            val intent = Intent(this, FenerbahceHistory::class.java)
            startActivity(intent)
        }
        fbfootballbtn.setOnClickListener {

            val intent = Intent(this, FenerbahceFootballTeam::class.java)
            startActivity(intent)
        }
        fbbasketballbtn.setOnClickListener {

            val intent = Intent(this, FenerbahceBasketballTeam::class.java)
            startActivity(intent)
        }

    }


}