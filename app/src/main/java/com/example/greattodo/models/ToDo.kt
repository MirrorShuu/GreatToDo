package com.example.greattodo.models

data class ToDo(
    val title: String,
    val description: String,
    val date: Long,
    var color: Color = Color.default,
    var priority: Priority = Priority.LOW)
