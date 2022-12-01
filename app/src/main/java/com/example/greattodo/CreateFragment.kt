package com.example.greattodo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.greattodo.databinding.CreatefragmentBinding
import com.example.greattodo.models.Color
import com.example.greattodo.models.DataBase
import com.example.greattodo.models.Priority
import com.example.greattodo.models.ToDo
import java.text.SimpleDateFormat
import java.util.*

class CreateFragment : Fragment() {

    private var _binding: CreatefragmentBinding? = null
    private val binding get() = _binding!!

    var color = Color.default
    var priority = Priority.default

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = CreatefragmentBinding.inflate(inflater, container, false)
        initClickListener()
        return binding.root
    }

    private fun initClickListener() {
        binding.red.setOnClickListener { color = Color.RED }
        binding.yellow.setOnClickListener { color = Color.YELLOW }
        binding.blue.setOnClickListener { color = Color.BLUE }
        binding.green.setOnClickListener { color = Color.GREEN }
        binding.white.setOnClickListener { color = Color.WHITE }

        binding.btmLow.setOnClickListener { priority = Priority.LOW }
        binding.btmMiddle.setOnClickListener { priority = Priority.MIDDLE }
        binding.btmHigh.setOnClickListener { priority = Priority.HIGH }
    }

    private fun save() {
        val title = binding.etTitle.text.toString()
        val description = binding.etDescription.text.toString()
        val date = System.currentTimeMillis()

        val todo = ToDo(
            title = title,
            description = description,
            date = date,
            color = color,
            priority = priority
        )
        DataBase.listTodo.add(todo)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        save()
    }
}






