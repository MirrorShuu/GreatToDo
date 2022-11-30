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
import com.example.greattodo.models.Priority
import com.example.greattodo.models.ToDo
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


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
        pickColor()
        save()
//        binding.red.setOnClickListener { pickColor() }
//        binding.yellow.setOnClickListener { pickColor() }
//        binding.blue.setOnClickListener { pickColor() }
//        binding.green.setOnClickListener { pickColor() }
//        binding.white.setOnClickListener { pickColor() }
        return binding.root


    }

    private fun pickColor(): Color {
        return when(view?.setOnClickListener{}){
            binding.red.setOnClickListener{} -> Color.RED
            binding.yellow.setOnClickListener{} -> Color.YELLOW
            binding.blue.setOnClickListener{} -> Color.BLUE
            binding.green.setOnClickListener{} -> Color.GREEN
            else -> {Color.WHITE}
        }

    }

//    private fun pickPriority():Priority{
//        return when(view?.setOnClickListener { }){
//            binding.btmLow.setOnClickListener {} -> Priority.
//        }
//    }


//    private fun onClick(): Color {
//        red = binding.red
//        yellow = binding.yellow
//        return when(view?.id){
//            R.id.yellow -> yellow
//            R.id.red -> red
//            else -> yellow
//        }
//        return Button(context)
//    }

    private fun save() {
        val title = binding.etTitle.text.toString()
        val description = binding.etDescription.text.toString()
        val dateMils = System.currentTimeMillis()
        val sdf = SimpleDateFormat("HH:mm:ss")
        val date = Date(dateMils)
        val todo = ToDo(
            title = title, description = description, date = sdf.format(date),
            color = pickColor())
        Log.d("MyTag",todo.toString())
        DataBase.listTodo.add(todo)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}






