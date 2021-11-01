package com.example.recyclerview_rakhayudhistira_27

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val supeherolist = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Manusia Semut"

            ),
            Superhero(
                R.drawable.panter,
                "Blak Panther",
                "Raja dari Wakanda"
            ),
            Superhero(
                R.drawable.capitan,
                "Captain Amerika",
                "Tetara AS yang tidak memiliki kemampuan sama sekali.Berkat bantuan Dr.Joshef Reinstein dengan serum super soldiernya"
            ),

            Superhero(
                R.drawable.iron_man,
                "Iron Man",
                "Genius,Sangat kuat,Kecepatan terbang mencapai Mach 3,Energi repulsor"
            ),
            Superhero(
                R.drawable.thor,
                "Thor",
                "Dewa yang memiliki kekuatan hebat menurut mitologi nordik"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, supeherolist){
            val intent = Intent (this, Detail_Superhero_activity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}