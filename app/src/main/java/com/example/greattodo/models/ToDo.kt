package com.example.greattodo.models

import android.widget.Button

data class ToDo(
    val title: String,
    val description: String,
    val date: String,
    var color: Color = Color.WHITE,
    var priority: Priority = Priority.LOW)
