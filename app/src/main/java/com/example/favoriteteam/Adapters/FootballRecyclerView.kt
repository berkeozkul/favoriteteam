package com.example.favoriteteam.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.favoriteteam.Model.FotballTeam
import com.example.favoriteteam.R

class FootballRecyclerView(val context: Context, val footballteam: List<FotballTeam>) : RecyclerView.Adapter<FootballRecyclerView.Holder>() {

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindPlayer(footballteam[position], context)
    }

    override fun getItemCount(): Int {
        return footballteam.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.football_card, parent, false)
        return Holder(view)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val playerimage = itemView?.findViewById<ImageView>(R.id.footballimage)
        val  playername= itemView?.findViewById<TextView>(R.id.footballname)
        val playernum = itemView?.findViewById<TextView>(R.id.footballnumber)
        val playerposition =itemView?.findViewById<TextView>(R.id.footballposition)
        val playercountry =itemView?.findViewById<ImageView>(R.id.country)

        fun bindPlayer(playerfb: FotballTeam, context: Context) {

            playerimage?.setImageResource(playerfb.image)
            playername?.text = playerfb.name
            playernum?.text= playerfb.number
            playerposition?.text= playerfb.position
            playercountry?.setImageResource(playerfb.country)



        }
    }


}