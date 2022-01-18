package com.raywenderlich.listmaker

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TodoListAdapter : RecyclerView.Adapter<TodoListViewHolder>() {
    private var todoLists = arrayOf("AndroidDevelopment", "HouseWork", "Errands")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        TODO("Not yet implemented")
    }



    override fun getItemCount(): Int {
       return todoLists.size
    }



    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }




}

