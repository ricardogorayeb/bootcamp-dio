package com.example.bootcampkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }

    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindViews()
        updateList()
    }



    private fun bindViews() {
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)

    }

    private fun updateList() {
        adapter.updateList(
                arrayListOf(
                        Contact(
                                name="Ricardo Gorayeb",
                                phone = "(00) 0000-0000",
                                photograph = "img.png"
                        ),
                        Contact(
                                name="Kellen Gorayeb",
                                phone = "(00) 0000-0000",
                                photograph = "img.png"
                        )
                )
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }


}