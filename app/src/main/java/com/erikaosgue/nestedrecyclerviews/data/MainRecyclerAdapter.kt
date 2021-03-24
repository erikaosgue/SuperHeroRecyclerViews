package com.erikaosgue.nestedrecyclerviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.erikaosgue.nestedrecyclerviews.model.AllCategory

class MainRecyclerAdapter(private val context: Context, private val allCategory: List<AllCategory>):
        RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {

     class MainViewHolder (private val view: View): RecyclerView.ViewHolder(view) {

         var categoryTitle: TextView? = null
         init {
             categoryTitle = view.findViewById(R.id.cat_title)
         }

        fun bind(itemView: AllCategory) {

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val myViewObject = LayoutInflater.from(parent.context).inflate(R.layout.main_recycler_row_item, parent, false)
        return MainViewHolder(myViewObject)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
       holder.categoryTitle?.text  = allCategory[position].categoryTitle
        holder.bind(allCategory[position])
    }

    override fun getItemCount(): Int {
        return allCategory.size
    }

}