package com.example.greattodo

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.greattodo.databinding.ActivityMainBinding
import com.example.greattodo.models.Color
import com.example.greattodo.models.ToDo

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val PROJECTION = arrayOf(Color.values())

//        val spinner1: Spinner = findViewById(R.id.spinner_color)
//        val adapter1 = ArrayAdapter.createFromResource(
//            this, Color.values().size, android.R.layout.simple_spinner_item)
//        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner1.adapter = adapter1





    }



}