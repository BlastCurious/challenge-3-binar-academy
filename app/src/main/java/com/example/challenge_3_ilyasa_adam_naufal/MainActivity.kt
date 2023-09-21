package com.example.challenge_3_ilyasa_adam_naufal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val listMenu = arrayListOf(
			ItemMenu("Ayam Panggang", "Rp 75.000"),
			ItemMenu("Cheese Burger", "Rp 45.000"),
			ItemMenu("Sushi", "Rp 20.000"),
			ItemMenu("Spaghetti", "Rp 35.000")
		)

		/*

		val listKategori
		val adapterH = MenuAdapter()*/
		val adapterV = MenuAdapter(listMenu)

		val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

		val recyclerView = findViewById<RecyclerView>(R.id.recycleview_vertical)

		recyclerView.layoutManager = layoutManager

		recyclerView.adapter = adapterV
	}
}