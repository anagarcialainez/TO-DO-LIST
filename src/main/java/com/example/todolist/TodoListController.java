package com.example.todolist;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoListController {
    private List<Task> TodoList;

    public TodoListController() {
        TodoList = new ArrayList<>();

    }

    @GetMapping("/TodoList")
    public List<Task> allTodoList() {
        return TodoList;
    }

    @PostMapping("/TodoList")
    public RedirectView addNewTask(Task task) {
        TodoList.add(task);
        return RedirectView("/");
    }
}
