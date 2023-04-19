package com.example.top_games_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.top_games_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()
    }

    private fun initialize(){
        with(binding){

            //AdapterView
            recyclerView.layoutManager = LinearLayoutManager(
                this@MainActivity,
                LinearLayoutManager.VERTICAL,
                false
            )

            //Data source: List of games
            var gamesList: ArrayList<GameModel> = ArrayList();

            val g1 = GameModel(R.drawable.card1, "Horizon Chase")
            val g2 = GameModel(R.drawable.card2, "PUBG")
            val g3 = GameModel(R.drawable.card3, "Head Ball 2")
            val g4 = GameModel(R.drawable.card4, "Hooked on You")
            val g5 = GameModel(R.drawable.card5, "FIFA 2022")
            val g6 = GameModel(R.drawable.card6, "Fortnite")
        }
    }
}