package com.example.greattodo.models

data class ToDo(val title: String,
                val description: String,
                val date: Long,
                val color: Color = Color.WHITE,
                val priority: Priority = Priority.LOW)
