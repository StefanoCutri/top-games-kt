package com.example.top_games_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gameList: ArrayList<GameModel>) :
    RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var gameImage: ImageView
        lateinit var gameTitle: TextView

        init {
            gameTitle = itemView.findViewById(R.id.cardViewText)
            gameImage = itemView.findViewById(R.id.cardViewImage)

            itemView.setOnClickListener() {
                Toast.makeText(
                    itemView.context,
                    "${gameList[adapterPosition].titleCard}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gameTitle.text = gameList[position].titleCard
        holder.gameImage.setImageResource(gameList[position].imgCard)
    }


    override fun getItemCount(): Int {
        return gameList.size
    }


}