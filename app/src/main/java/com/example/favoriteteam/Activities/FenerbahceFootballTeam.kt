package com.example.favoriteteam.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.favoriteteam.Adapters.FootballRecyclerView
import com.example.favoriteteam.R
import com.example.favoriteteam.Service.Player

class FenerbahceFootballTeam : AppCompatActivity() {
    lateinit var  playerlistview : RecyclerView
    lateinit var  adapter : FootballRecyclerView
    lateinit var backbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fenerbahce_football_team)
        playerlistview = findViewById(R.id.footballrcycle)

        adapter = FootballRecyclerView(this,Player.footballTeam)

        playerlistview.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        playerlistview.layoutManager = layoutManager
        playerlistview.setHasFixedSize(true)

        backbtn = findViewById(R.id.back_btn)

        backbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }



    }
}