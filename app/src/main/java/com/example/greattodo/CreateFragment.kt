package com.example.greattodo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.greattodo.databinding.CreatefragmentBinding
import com.example.greattodo.models.Color
import com.example.greattodo.models.ToDo


class CreateFragment : Fragment() {

    private var _binding: CreatefragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = CreatefragmentBinding.inflate(inflater, container, false)
            return binding.root
//            binding.spinnerColor.adapter(ArrayAdapter<Color>.)

        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            binding.btmSave.setOnClickListener {
                findNavController().navigate(R.id.action_listFragment_to_createFragment)
            }
        }

        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }




