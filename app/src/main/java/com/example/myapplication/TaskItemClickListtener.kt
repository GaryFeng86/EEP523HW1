package com.example.myapplication

interface TaskItemClickListtener {
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}