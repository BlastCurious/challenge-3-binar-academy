package com.example.challenge_3_ilyasa_adam_naufal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
	private val listmenu: ArrayList<ItemMenu>
) :
	RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

	//Class holder
	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val name = itemView.findViewById<TextView>(R.id.title_menu)!!
		val price = itemView.findViewById<TextView>(R.id.price_menu)!!
		val image = itemView.findViewById<ImageView>(R.id.image_menu)!!
	}

	// Membuat Holder
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val view = LayoutInflater.from(parent.context)
			.inflate(R.layout.list_item_menu, parent, false)
		return ViewHolder(view)
	}

	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		val (name, price, image) = listmenu[position]
		holder.name.text = name
		holder.price.text = price
		holder.image.setImageResource(image)
	}

	override fun getItemCount(): Int {
		return listmenu.size
	}
}