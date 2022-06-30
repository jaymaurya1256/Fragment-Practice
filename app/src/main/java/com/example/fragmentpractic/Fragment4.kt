package com.example.fragmentpractic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentpractic.databinding.Fragment4Binding

class Fragment4 : Fragment() {
    var _binding:Fragment4Binding? = null
    val binding get() =  _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment4Binding.inflate(layoutInflater)
        return binding.root
    }


}