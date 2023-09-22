package com.example.challenge_3_ilyasa_adam_naufal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.challenge_3_ilyasa_adam_naufal.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

	private val listviewlayout = "List_View"
	private val gridviewlayout = "Grid_View"
	var currentview = listviewlayout

	private var _binding: HomeFragmentBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		// Inflate the layout for this fragment
		_binding = HomeFragmentBinding.inflate(inflater, container, false)

		return binding.root

	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		binding.gridlist.setOnClickListener {
			if (currentview == listviewlayout) {
				binding.gridlist.setImageDrawable(
					ContextCompat.getDrawable(
						requireActivity(), R.drawable.list_icon
					)
				)
				gridview()
			} else {
				binding.gridlist.setImageDrawable(
					ContextCompat.getDrawable(
						requireActivity(), R.drawable.health_data
					)
				)
				listview()
			}

		}
	}

	private val listkategori = arrayListOf<Category>(
		Category("Drink", R.drawable.foodiesfeed_com_strawberry_milk_splash),
		Category("Fast Food", R.drawable.foodiesfeed_com_fried_chicken_commercial),
		Category("Western", R.drawable.foodiesfeed_com_french_fries_with_ketchup_top_view),
		Category("Middle East", R.drawable.foodiesfeed_com_pizza_ready_for_baking),
		Category("Asian", R.drawable.foodiesfeed_com_crispy_spicy_chicken_wings)
	)

	private val listMenu = arrayListOf(
		ItemMenu("Grilled Chicken", "Rp 75.000", R.drawable.foodiesfeed_com_grilled_whole_chicken),
		ItemMenu("Cheese Burger", "Rp 45.000", R.drawable.foodiesfeed_com_cheeseburger),
		ItemMenu("Sushi", "Rp 20.000", R.drawable.foodiesfeed_com_salmon_sushi_maki),
		ItemMenu("Spaghetti", "Rp 35.000", R.drawable.foodiesfeed_com_cherry_tomatoes_spaghetti),
		ItemMenu("Dimsum", "Rp 40.000", R.drawable.foodiesfeed_com_xiaolongbao_dumplings),
		ItemMenu("Chicken Satay", "Rp 30.000", R.drawable.foodiesfeed_com_grilling_chicken_satay)
	)

	private fun listview() {
		currentview = listviewlayout
		binding.recycleviewVertical.layoutManager = LinearLayoutManager(requireActivity())
		binding.recycleviewVertical.adapter = MenuAdapter(listMenu)
	}

	private fun gridview() {
		currentview = gridviewlayout
		binding.recycleviewVertical.layoutManager = GridLayoutManager(requireActivity(), 2)
		binding.recycleviewVertical.adapter = MenuAdapter(listMenu)
	}


}