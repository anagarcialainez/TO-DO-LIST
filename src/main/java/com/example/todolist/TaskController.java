package com.example.todolist;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    private final List<Task> tasks = new ArrayList<>();

    @GetMapping("/TodoList")
    public List<Task> allTasks() {
        return tasks;
    }

    @PostMapping("/TodoList")
    public RedirectView addTask(Task task) {
        tasks.add(task);
        return new RedirectView("/");
    }

    @DeleteMapping("/TodoList/{index}")
    void deleteTask(@PathVariable int index) {
        tasks.remove(index);
    }
}
