package com.example.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TasksController {
    private List<Task> tasks;

    public TasksController() { tasks= new ArrayList<>();
    }
}
@GetMapping("/tasks")

