package com.example.nested_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val parentList = ArrayList<ParentItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView = findViewById(R.id.parentRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter
    }

    private fun addDataToList() {

        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("C", R.drawable.cake))
        childItems1.add(ChildItem("C#", R.drawable.pharatha))
        childItems1.add(ChildItem("Java", R.drawable.biryani))
        childItems1.add(ChildItem("C++", R.drawable.dala))

        parentList.add(ParentItem("Game Development", R.drawable.krishan, childItems1))

        val childItem2 = ArrayList<ChildItem>()
        childItem2.add(ChildItem("Kotlin", R.drawable.friede))
        childItem2.add(ChildItem("XML", R.drawable.panner))
        childItem2.add(ChildItem("Java", R.drawable.google))
        parentList.add(
            ParentItem(
                "Android Development",
                R.drawable.pizza,
                childItem2
            )
        )
        val childItem3 = ArrayList<ChildItem>()
        childItem3.add(ChildItem("JavaScript", R.drawable.khichdi))
        childItem3.add(ChildItem("HTML", R.drawable.pharatha))
        childItem3.add(ChildItem("CSS", R.drawable.friede))
        parentList.add(
            ParentItem(
                "Front End Web",
                R.drawable.krishan,
                childItem3
            )
        )
        val childItem4 = ArrayList<ChildItem>()
        childItem4.add(ChildItem("Julia", R.drawable. google))
        childItem4.add(ChildItem("Python", R.drawable.pizza))
        childItem4.add(ChildItem("R", R.drawable.friede))
        parentList.add(
            ParentItem(
                "Artificial Intelligence",
                R.drawable.biryani,
                childItem4
            )
        )
    }

}