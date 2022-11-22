package com.example.greattodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.greattodo.databinding.CreatefragmentBinding



class CreateFragment : Fragment() {

    private var _binding: CreatefragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = CreatefragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btmSave.setOnClickListener {
            findNavController().navigate(R.id.action_ListFragment_to_SecondFragment)
        }
    }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }



