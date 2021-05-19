package com.example.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    private final List<Task> tasks = new ArrayList<>();

    @GetMapping("/Task")
    public List<Task> allTasks() {
        return tasks;
    }
    @PostMapping("/Task")
    public void addTask(Task task) {
        tasks.add(task);
    }
}
