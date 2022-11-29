package com.example.greattodo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.greattodo.databinding.CreatefragmentBinding
import com.example.greattodo.models.Color
import com.example.greattodo.models.DataBase
import com.example.greattodo.models.ToDo


class CreateFragment : Fragment(){

    private var _binding: CreatefragmentBinding? = null
    private val binding get() = _binding!!
    lateinit var red  : Button
    lateinit var yellow  : Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CreatefragmentBinding.inflate(inflater, container, false).apply {
            btmSave.setOnClickListener { save() }
            btmExit.setOnClickListener {
                for (i in DataBase.listTodo) {
                    Log.d("myTag", i.toString())
                }
            }
        }
        save()
        return binding.root


    }

    private fun onClick(): Button {
        red = binding.red
        yellow = binding.yellow
        when(view?.id){
            R.id.yellow -> yellow
            R.id.red -> red
            else -> yellow
        }
        return Button(context)
    }

    private fun save() {
        val title = binding.etTitle.text.toString()
        val description = binding.etDescription.text.toString()
        val color = onClick()
        val todo = ToDo(
            title = title, description = description, date = System.currentTimeMillis(),
            color = onClick())
        Log.d("MyTag","$title, $description, $color")
        DataBase.listTodo.add(todo)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}




