package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.LocalDate
import java.time.LocalTime
import java.util.UUID

class TaskViewModel:ViewModel() {
    var taskItems = MutableLiveData<MutableList<TaskItem>>()
    init {
        taskItems.value = mutableListOf()
    }

    fun addTaskItem(newTask: TaskItem) {
        val list = taskItems.value
        list !!.add(newTask)
        taskItems.postValue(list)
    }
    fun updateTaskItem(id:UUID, name: String, desc: String, dueTime: LocalTime?) {
        val list =taskItems.value
        val task = list!!.find { it.id == id }!!
        task.name = name
        task.desc = desc
        task.dueTime = dueTime
        taskItems.postValue(list)
    }
    fun setCompleted(taskItem: TaskItem) {
        var list = taskItems.value
        val task = list!!.find { it.id == taskItem.id }!!
        if(task.completedDate == null) {
            task.completedDate = LocalDate.now()
        }
        taskItems.postValue(list)
    }
    fun setDeleted(taskId: UUID) {
        val list = taskItems.value ?: return
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            val task = iterator.next()
            if (task.id == taskId) {
                iterator.remove() //
            }
        }
        taskItems.postValue(list) //
    }
}