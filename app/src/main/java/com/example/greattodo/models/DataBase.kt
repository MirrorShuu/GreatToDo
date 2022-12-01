package com.example.greattodo.models

object DataBase {
    val listTodo = mutableListOf<ToDo>()

    fun getFakeList(): List<ToDo> {
        val list = mutableListOf<ToDo>()
        for (i in 0..50) {
            list.add(
                ToDo(
                    title = "title #$i",
                    description = "description #$i",
                    date = System.currentTimeMillis()
                )
            )
        }
        return list
    }
}