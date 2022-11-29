package com.example.greattodo.models

import android.widget.Button

data class ToDo(
    val title: String,
    val description: String,
    val date: Long,
    var color: Button,
    var priority: Priority = Priority.LOW)
