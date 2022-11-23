package com.example.greattodo.models

interface RepositoryDatabase {
  suspend fun insert(toDo: ToDo)
  suspend fun delete(toDo: ToDo)
  suspend fun getAll(toDo: List<ToDo>)
}