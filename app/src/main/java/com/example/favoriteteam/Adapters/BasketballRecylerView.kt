package com.example.favoriteteam.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.favoriteteam.Model.BasketballTeam
import com.example.favoriteteam.R

class BasketballRecylerView(val context: Context, val basketballteam: List<BasketballTeam>) : RecyclerView.Adapter<BasketballRecylerView.Holder>() {

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindPlayer(basketballteam[position], context)
    }

    override fun getItemCount(): Int {
        return basketballteam.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.basketball_card, parent, false)
        return Holder(view)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val playerimage = itemView?.findViewById<ImageView>(R.id.basketballimage)
        val  playername= itemView?.findViewById<TextView>(R.id.basketballname)
        val playernum = itemView?.findViewById<TextView>(R.id.basketballnumber)
            val playerposition =itemView?.findViewById<TextView>(R.id.basketballposition)
        val playercountry =itemView?.findViewById<ImageView>(R.id.country)


        fun bindPlayer(playerbasketfb: BasketballTeam, context: Context) {

            playerimage?.setImageResource(playerbasketfb.image)
            playername?.text = playerbasketfb.name
            playernum?.text= playerbasketfb.number
            playerposition?.text= playerbasketfb.position
            playercountry?.setImageResource(playerbasketfb.country)



        }
    }


}