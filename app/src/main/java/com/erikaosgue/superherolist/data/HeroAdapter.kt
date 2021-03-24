package com.erikaosgue.superherolist.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.erikaosgue.superherolist.R
import com.erikaosgue.superherolist.model.SuperHero
import com.squareup.picasso.Picasso

class HeroAdapter(private val superHeroList: List<SuperHero>): RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    inner class HeroHolder (private val view: View): RecyclerView.ViewHolder(view) {

        fun bind(superHero: SuperHero) {
            val superHeroName: TextView = view.findViewById<TextView>(R.id.rvSuperHeroName)
            val realName = view.findViewById<TextView>(R.id.tvRealName)
            val publisher = view.findViewById<TextView>(R.id.tvPusblisher)
            val heroImage = view.findViewById<ImageView>(R.id.ivHero)
            superHeroName.text = superHero.superHeroName
            realName.text = superHero.realName
            publisher.text = superHero.publisher
            Picasso.get().load(superHero.image).into(heroImage)

            view.setOnClickListener {
                Toast.makeText(view.context, "You select: $superHeroName", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val myViewObject = LayoutInflater.from(parent.context).inflate(R.layout.item_superhero_list, parent, false)
        return HeroHolder(myViewObject)
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
       holder.bind(superHeroList[position])
    }

    override fun getItemCount(): Int {
        return superHeroList.size
    }
}