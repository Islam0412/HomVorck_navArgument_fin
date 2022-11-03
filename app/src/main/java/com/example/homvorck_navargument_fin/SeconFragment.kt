package com.example.homvorck_navargument_fin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.homvorck_navargument_fin.databinding.FragmentMainBinding
import com.example.homvorck_navargument_fin.databinding.FragmentSeconBinding


class SeconFragment : Fragment() {
private lateinit var binding: FragmentSeconBinding
private lateinit var navArgs: SeconFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
binding= FragmentSeconBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs = SeconFragmentArgs.fromBundle(it)
            binding.tvNem.text= navArgs.argmarval.name
            binding.tvAliv.text = navArgs.argmarval.liga
            Glide.with(binding.imgSecondFr).load(navArgs.argmarval.imach).into(binding.imgSecondFr)
        }
    }

}