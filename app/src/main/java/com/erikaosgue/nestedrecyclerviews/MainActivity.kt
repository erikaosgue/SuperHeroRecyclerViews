package com.erikaosgue.nestedrecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.erikaosgue.nestedrecyclerviews.databinding.ActivityMainBinding
import com.erikaosgue.nestedrecyclerviews.model.AllCategory
import com.erikaosgue.nestedrecyclerviews.model.CategoryItem
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    private var mainCategoryRecycler: RecyclerView? = null
    private var mainRecyclerAdapter: MainRecyclerAdapter? = null

    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)


        val categoryItemList: MutableList<CategoryItem> = ArrayList()

        categoryItemList.add(CategoryItem("Spiderman", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        categoryItemList.add(CategoryItem("Daradevil", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        categoryItemList.add(CategoryItem("Logan", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        categoryItemList.add(CategoryItem("Batman", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        categoryItemList.add(CategoryItem("Thor", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        categoryItemList.add(CategoryItem("Flash", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        categoryItemList.add(CategoryItem("Green-Lantern", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        categoryItemList.add(CategoryItem("Wonder-W", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))

        val categoryItemList2: MutableList<CategoryItem> = ArrayList()
        categoryItemList2.add(CategoryItem("Green-Lantern", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        categoryItemList2.add(CategoryItem("Wonder-W", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
        categoryItemList2.add(CategoryItem("Spiderman", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        categoryItemList2.add(CategoryItem("Daradevil", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        categoryItemList2.add(CategoryItem("Logan", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        categoryItemList2.add(CategoryItem("Batman", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        categoryItemList2.add(CategoryItem("Thor", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        categoryItemList2.add(CategoryItem("Flash", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))

        val categoryItemList3: MutableList<CategoryItem> = ArrayList()
        categoryItemList3.add(CategoryItem("Logan", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        categoryItemList3.add(CategoryItem("Batman", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        categoryItemList3.add(CategoryItem("Spiderman", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        categoryItemList3.add(CategoryItem("Daradevil", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        categoryItemList3.add(CategoryItem("Thor", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        categoryItemList3.add(CategoryItem("Flash", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        categoryItemList3.add(CategoryItem("Green-Lantern", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        categoryItemList3.add(CategoryItem("Wonder-W", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))

        val categoryItemList4: MutableList<CategoryItem> = ArrayList()
        categoryItemList4.add(CategoryItem("Thor", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        categoryItemList4.add(CategoryItem("Flash", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        categoryItemList4.add(CategoryItem("Green-Lantern", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        categoryItemList4.add(CategoryItem("Spiderman", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        categoryItemList4.add(CategoryItem("Daradevil", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        categoryItemList4.add(CategoryItem("Logan", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        categoryItemList4.add(CategoryItem("Batman", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        categoryItemList4.add(CategoryItem("Wonder-W", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))

        val categoryItemList5: MutableList<CategoryItem> = ArrayList()
        categoryItemList5.add(CategoryItem("Wonder-W", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
        categoryItemList5.add(CategoryItem("Spiderman", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        categoryItemList5.add(CategoryItem("Daradevil", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        categoryItemList5.add(CategoryItem("Logan", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        categoryItemList5.add(CategoryItem("Batman", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        categoryItemList5.add(CategoryItem("Thor", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        categoryItemList5.add(CategoryItem("Flash", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        categoryItemList5.add(CategoryItem("Green-lantern", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))



        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("Hollywood", categoryItemList))
        allCategory.add(AllCategory("Best Oscars", categoryItemList2))
        allCategory.add(AllCategory("Movies Dubbed in Hindi", categoryItemList3))
        allCategory.add(AllCategory("Category 4th", categoryItemList4))
        allCategory.add(AllCategory("Category 5th", categoryItemList5))

        setMainCategoryRecycler(allCategory)
    }

    private fun setMainCategoryRecycler(allCategory: List<AllCategory>) {
        // Initializing the RecyclerView
        mainCategoryRecycler = findViewById(R.id.main_recycler)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = MainRecyclerAdapter(this, allCategory)
        mainCategoryRecycler!!.adapter = mainRecyclerAdapter
    }


}