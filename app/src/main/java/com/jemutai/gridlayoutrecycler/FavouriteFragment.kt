package com.jemutai.gridlayoutrecycler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jemutai.gridlayoutrecycler.R.layout
import com.jemutai.gridlayoutrecycler.databinding.FragmentFavouriteBinding

class FavouritesFragment : Fragment() {

    private lateinit var binding: FragmentFavouriteBinding
    private lateinit var viewModel: FavouritesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favourite, container, false)
        viewModel = ViewModelProvider(this).get(FavouritesViewModel::class.java)

        val adapter = MovieAdapter(viewModel.movies.value ?: emptyList())
        binding.recyclerView.adapter = adapter

        viewModel.movies.observe(viewLifecycleOwner, Observer {
            adapter.notifyDataSetChanged()
        })

        return binding.root
    }
}
