package com.example.example

import android.R.attr.data
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() , MyAdapter.OnItemClickListener{
    lateinit var bt:Button
    lateinit var btnAjouter:Button
    lateinit var monText:TextView

    private lateinit var recycleView: RecyclerView
    private lateinit var manager : RecyclerView.LayoutManager
    private lateinit var myAdapter: RecyclerView.Adapter<*>

    var values: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..3) values.add("item$i")

        bt = findViewById(R.id.btnSuivant)
        btnAjouter = findViewById(R.id.btnAjouter)
        monText =  findViewById(R.id.MonText)

        btnAjouter.setOnClickListener {
          values.add("item${values.size}")
            myAdapter.notifyItemChanged(values.size+1)
        }

        manager = LinearLayoutManager(this)
        myAdapter = MyAdapter(values, this)
        recycleView = findViewById<RecyclerView>(R.id.recycleView).apply {
            layoutManager = manager
            adapter = myAdapter
        }
    }

    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Item $position clicked", Toast.LENGTH_SHORT).show()
        values[position] = "Clicked"
        myAdapter.notifyItemChanged(position)
    }

}