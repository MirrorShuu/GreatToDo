package com.example.greattodo.models

data class ToDo(
    val title: String,
    val description: String,
    val date: Long,
    var color: Color = Color.WHITE,
    var priority: Priority = Priority.LOW)
