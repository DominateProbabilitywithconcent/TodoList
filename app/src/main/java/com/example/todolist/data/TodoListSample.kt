package com.example.todolist.data

import com.example.todolist.model.Todo
import java.util.Calendar

class TodoListSample {
    fun getTodoSample(): List<Todo> {
        return listOf(
            Todo(
                id = 0,
                name = "ABC",
                date = Calendar.getInstance().apply {
                    set(2025, Calendar.APRIL, 15, 9, 0)
                }.time,
                isCompleted = false),
            Todo(
                id = 1,
                name = "Coffee Maker",
                date = Calendar.getInstance().apply {
                    set(2025, Calendar.APRIL, 15, 13, 30)
                }.time,
                isCompleted = false),
            Todo(
                id = 2,
                name = "Have a walk",
                date = Calendar.getInstance().apply {
                    set(2025, Calendar.APRIL, 14, 23, 50)
                }.time,
                isCompleted = true)
        )
    }
}