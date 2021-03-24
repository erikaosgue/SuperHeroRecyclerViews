package com.erikaosgue.nestedrecyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.erikaosgue.nestedrecyclerviews.databinding.ActivityMainBinding
import com.erikaosgue.nestedrecyclerviews.model.AllCategory

class MainActivity : AppCompatActivity() {

    private var mainCategoryRecycler: RecyclerView? = null
    private var mainRecyclerAdapter: MainRecyclerAdapter? = null

    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
//        initRecycler()
        val allCategory: MutableList<AllCategory> = ArrayList()
        allCategory.add(AllCategory("Hollywood"))
        allCategory.add(AllCategory("Best Oscars"))
        allCategory.add(AllCategory("Movies Dubbed in Hindi"))
        allCategory.add(AllCategory("Category 4th"))
        allCategory.add(AllCategory("Category 5th"))

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

//    fun getSuperHeros() : MutableList<SuperHero> {
//        val superHeros: MutableList<SuperHero> = ArrayList()
//        superHeros.add(SuperHero("Spiderman", "Marvel", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
//        superHeros.add(SuperHero("Daredevil", "Marvel", "Matthew Michael Murdock", "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
//        superHeros.add(SuperHero("Wolverine", "Marvel", "James Howlett", "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
//        superHeros.add(SuperHero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
//        superHeros.add(SuperHero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
//        superHeros.add(SuperHero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
//        superHeros.add(SuperHero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
//        superHeros.add(SuperHero("Wonder Woman", "DC", "Princess Diana", "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
//        return superHeros
//    }
//    fun initRecycler(){
//        activityMainBinding.rvSuperHero.layoutManager = LinearLayoutManager(this)
//        val adaper = HeroAdapter(getSuperHeros())
//        activityMainBinding.rvSuperHero.adapter = adaper
//    }

}