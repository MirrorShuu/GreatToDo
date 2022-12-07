package com.example.greattodo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.greattodo.databinding.TodoItemBinding
import com.example.greattodo.models.DataBase
import com.example.greattodo.models.ToDo

class ListAdapter(): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private val listToDo = DataBase.getFakeList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater : LayoutInflater = LayoutInflater.from(parent.context)
        val binding : TodoItemBinding = TodoItemBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listToDo[position])
    }

    override fun getItemCount(): Int = listToDo.size

    inner class ListViewHolder(private var binding: TodoItemBinding)
        :RecyclerView.ViewHolder(binding.root) {

        private lateinit var todo :ToDo

        fun bind(toDo: ToDo) {
            this.todo = toDo
            binding.itemDescription.text = todo.description
            binding.itemTitle.text = todo.title
            binding.itemTime.text = todo.date.formatDate()
            binding.itemPriority.text = todo.priority.toString()
        }
    }

}