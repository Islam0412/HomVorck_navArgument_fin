package com.example.homvorck_navargument_fin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homvorck_navargument_fin.databinding.ItemMarvelBinding

class MustiteliAdapter(
    private var marvelDataClas: List<MarvelDataClas>
,var onClick: (position: Int) -> Unit
    ): RecyclerView.Adapter<MustiteliAdapter.HolderMustiteli>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderMustiteli {
        return HolderMustiteli(ItemMarvelBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: HolderMustiteli, position: Int) {
       holder.onBind(marvelDataClas[position],position)
    }

    override fun getItemCount() = marvelDataClas.size


    inner class HolderMustiteli(private var binding: ItemMarvelBinding) :RecyclerView.ViewHolder(binding.root) {
        fun onBind (marve : MarvelDataClas, position: Int) {
            itemView.setOnClickListener { onClick(position)
            }
            binding.tvLiga.text = marve.name
            binding.tvName.text =  marve.name
            Glide.with(binding.itemImg).load(marve.imach).into(binding.itemImg)


        }

    }
}