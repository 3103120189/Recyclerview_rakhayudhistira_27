package com.example.recyclerview_rakhayudhistira_27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Detail_Superhero_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anggota = intent.getParcelableExtra<Superhero>(MainActivity.INTENT_PARCELABLE)

        val imgSuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = findViewById<TextView>(R.id.tv_item_name)
        val detail = findViewById<TextView>(R.id.detailanggota)
        val id = findViewById<EditText>(R.id.inputnama)
        val btn = findViewById<Button>(R.id.buttontampil)

        imgSuperhero.setImageResource(anggota?.imgSuperhero!!)
        nameSuperhero.text = anggota.nameSupehero


        btn.setOnClickListener{
            val input = id.text.toString()
            var hasil = when(input) {
                in "" -> Toast.makeText(applicationContext, "Kata kunci harus di isi", Toast.LENGTH_SHORT).show()
                in "Ant-man" -> "Nama : Ant-man \n Deskripsi : Manusia semut"
                in "Black Panther" -> "Nama : Black Panther \n Deskripsi : Raja dari Wakanda"
                in "Captain Amerika" -> "Nama : Captain Amerika \n Deskripsi : Tetara AS yang tidak memiliki kemampuan sama sekali.Berkat bantuan Dr.Joshef Reinstein dengan serum super soldiernya"
                in "IronMan" -> "Nama : IronMan \n Deskripsi : Genius,Sangat kuat,Kecepatan terbang mencapai Mach 3,Energi repulsor"
                in "Thor" -> "Nama : Thor \n Deskripsi : Dewa yang memiliki kekuatan hebat menurut mitologi nordik"
                else -> Toast.makeText(applicationContext, "Maaf kata kunci yang anda masukan salah", Toast.LENGTH_SHORT).show()
            }
            detail.text = "$hasil"
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}