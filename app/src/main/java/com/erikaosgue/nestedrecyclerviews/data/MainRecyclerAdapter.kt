package com.erikaosgue.nestedrecyclerviews

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.erikaosgue.nestedrecyclerviews.data.CategoryItemAdapter
import com.erikaosgue.nestedrecyclerviews.model.AllCategory
import com.erikaosgue.nestedrecyclerviews.model.CategoryItem

class MainRecyclerAdapter(private val context: Context, private val allCategoryList: List<AllCategory>):
        RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {

     class MainViewHolder (private val view: View): RecyclerView.ViewHolder(view) {

         var categoryTitle: TextView
         var itemRecycler: RecyclerView
         init {
             categoryTitle = view.findViewById(R.id.cat_title)
             itemRecycler = view.findViewById(R.id.cat_item_recycler)

//             fun bind(itemView: AllCategory) {
//
//             }
         }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val myViewObject = LayoutInflater.from(parent.context).inflate(R.layout.main_recycler_row_item, parent, false)
        return MainViewHolder(myViewObject)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.categoryTitle.text  = allCategoryList[position].categoryTitle
        setCatItemRecycler(holder.itemRecycler, allCategoryList[position].categoryItemList)

    }

    override fun getItemCount(): Int {
        return allCategoryList.size
    }
    private fun setCatItemRecycler(recyclerView: RecyclerView, categoryItemList: List<CategoryItem>){
        val itemRecyclerAdapter = CategoryItemAdapter(context, categoryItemList)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }

}