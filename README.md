This README provides an overview of the ToDoList app developed using Kotlin.

Overview

This ToDoList app allows users to manage a list of tasks. Users can add new tasks, remove existing tasks, and set deadlines for tasks using a time picker dialog.

Features

1.Add Task: Users can add new tasks to the list.
2.Remove Task: Tasks can be removed from the list.
3.Set Deadlines: Users can set deadlines for tasks using a time picker dialog.
4.Task Count: The app displays the total number of tasks in the list.
Development Environment

Development Tools: This app is developed using Android Studio with Kotlin.
Dependencies: The app uses androidx.lifecycle.ViewModel to manage UI-related data in a lifecycle-conscious way.
Getting Started

To run the app:

1.Clone or download the source code.

2.Open the project in Android Studio.

3.Connect an Android device or use an emulator.

4.Build and run the app from Android Studio.

Code Structure

MainActivity.kt: Main activity class responsible for setting up the UI and handling user interactions.
TaskViewModel.kt: ViewModel class that manages the task data and business logic.
TaskItemAdapter.kt: RecyclerView adapter to display the list of tasks.
task_item_cell.xml: Layout file for individual task items displayed in the RecyclerView.
Screenshots

![image](https://github.com/GaryFeng86/EEP523HW1/blob/master/1.png)
![image](https://github.com/GaryFeng86/EEP523HW1/blob/master/2.png)
![image](https://github.com/GaryFeng86/EEP523HW1/blob/master/3.png)
![image](https://github.com/GaryFeng86/EEP523HW1/blob/master/4.png)
![image](https://github.com/GaryFeng86/EEP523HW1/blob/master/5.png)
![image](https://github.com/GaryFeng86/EEP523HW1/blob/master/6.png)
Video Demonstration

Watch a demo of the app on Google Drive：https://drive.google.com/file/d/14kGXWqGV0P6K36tqLXo5YCoHdwi9eKqv/view

Development Details

Time Taken: I spent approximately 6 hours completing this app.

Challenges Faced:
Implementing the RecyclerView and managing task item interactions.
Handling task updates and deletions efficiently using ViewModel.

Resources Used:
Android Developer Documentation
Kotlin Programming Guides
Stack Overflow for troubleshooting
