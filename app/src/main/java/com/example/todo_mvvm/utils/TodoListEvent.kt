package com.example.todo_mvvm.utils

import com.example.todo_mvvm.data.Todo

sealed class TodoListEvent{
    data class deleteTodo(val todo: Todo):TodoListEvent()
    data class onDoneChange(val todo: Todo, val isDone:Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object  OnAddTodoClick : TodoListEvent()
}
