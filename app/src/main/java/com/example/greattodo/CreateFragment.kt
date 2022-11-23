package com.example.greattodo

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.greattodo.databinding.CreatefragmentBinding
import com.example.greattodo.models.ToDo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


class CreateFragment : Fragment()  {

    private var _binding: CreatefragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var titleText: String
    private lateinit var descriptionText: String
    private val color = arrayOf("red","blue","white")




    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)






    }
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = CreatefragmentBinding.inflate(inflater, container, false)
            return binding.root
        }

        @RequiresApi(Build.VERSION_CODES.O)
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            save()



//            val spinner = binding.spinnerColor
//            ArrayAdapter.createFromResource(
//                requireContext(),
//                R.array.color,
//                android.R.layout.simple_spinner_item
//            ).also { adapter ->
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//                spinner.adapter = adapter
//            }

        }



    @RequiresApi(Build.VERSION_CODES.O)
    private fun save(){
        titleText = binding.etTitle.text.toString()
        descriptionText = binding.etDescription.text.toString()
        binding.btmSave.setOnClickListener {
            val simpleDateFormat = DateTimeFormatter.ofPattern("HH:mm:ss")
            val dateTime: String = LocalDateTime.now().format(simpleDateFormat)
            Log.d("myTag", dateTime)
             ToDo(titleText,descriptionText,dateTime)
            findNavController().navigate(R.id.action_createFragment_to_listFragment)

        }

    }



        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }




