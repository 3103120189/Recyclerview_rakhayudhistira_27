package com.example.recyclerview_rakhayudhistira_27

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperheroAdapter(private val context: Context, private val superherp: List<Superhero>, val listener: (Superhero) -> Unit)
    : RecyclerView.Adapter<SuperheroAdapter.AnggotaViewHolder>(){
    class AnggotaViewHolder(view: View): RecyclerView.ViewHolder (view) {

        val imgAnggota = view.findViewById<ImageView>(R.id.img_item_photo)
        val namaAnggota = view.findViewById<TextView>(R.id.tv_item_name)
        val descAnggota = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superherp: Superhero, listener: (Superhero) -> Unit){
            imgAnggota.setImageResource(superherp.imgSuperhero)
            namaAnggota.text = superherp.nameSupehero
            descAnggota.text = superherp.descSuperhero
            itemView.setOnClickListener{
                listener(superherp)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnggotaViewHolder {
        return AnggotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.card_hero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnggotaViewHolder, position: Int) {
        holder.bindView(superherp[position], listener)
    }

    override fun getItemCount(): Int = superherp.size
    }
