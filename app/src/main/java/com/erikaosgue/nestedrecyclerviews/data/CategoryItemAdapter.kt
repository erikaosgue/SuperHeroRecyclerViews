package com.erikaosgue.nestedrecyclerviews.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.erikaosgue.nestedrecyclerviews.R
import com.erikaosgue.nestedrecyclerviews.model.CategoryItem
import com.squareup.picasso.Picasso

class CategoryItemAdapter(private val context:Context, val categoryItemList: List<CategoryItem>): RecyclerView.Adapter<CategoryItemAdapter.CategoryItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryItemAdapter.CategoryItemViewHolder {
        val categoryItemObject = LayoutInflater.from(context).inflate(R.layout.cat_row_items, parent, false)
        return CategoryItemViewHolder(categoryItemObject)
    }

    override fun onBindViewHolder(holder: CategoryItemAdapter.CategoryItemViewHolder, position: Int) {
        // setImageResource to Put the Image in the ImageView

        holder.bind(categoryItemList[position])
//        Picasso.get().load(categoryItemList[position].imageUrl).into(holder.itemImage)

    }

    override fun getItemCount(): Int {
        return categoryItemList.size
    }

    class CategoryItemViewHolder(val view: View): RecyclerView.ViewHolder(view){


        fun bind(categoryItem: CategoryItem) {
            val itemImage = view.findViewById<ImageView>(R.id.item_image)
            val itemDescription = view.findViewById<TextView>(R.id.image_description)

            Picasso.get().load(categoryItem.imageUrl).into(itemImage)
            itemDescription.text = categoryItem.itemDescription

            view.setOnClickListener {
                Toast.makeText(view.context, "${itemDescription.text}", Toast.LENGTH_SHORT).show()


            }
        }
    }
}