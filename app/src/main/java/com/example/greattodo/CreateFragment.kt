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
import com.example.greattodo.models.DataBase
import com.example.greattodo.models.ToDo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


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
        _binding = CreatefragmentBinding.inflate(inflater, container, false).apply {
            btmSave.setOnClickListener{save()}
            btmExit.setOnClickListener{
                for (i in DataBase.listTodo){
                    Log.d("myTag", i.toString())
                }
            }
        }

        return binding.root



    }

    fun save(){
            val title = binding.etTitle.text.toString()
            val description = binding.etDescription.text.toString()
            val color = binding.red
            val priority = binding.btmLow
            var todo = ToDo(title = title,description = description, date = System.currentTimeMillis())
        DataBase.listTodo.add(todo)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}




