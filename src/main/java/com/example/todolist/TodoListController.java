package com.example.todolist;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoListController {
    private List<Task> TodoList ;

    public TodoListController() {
        TodoList = List.of(
                new Task("estudiar java"),
                new Task("practicar todos los dias"),
                new Task("suicidarse")
        );
    }
}
@GetMapping ("/TodoList")
public List<Task> allTodoList() {
    return TodoList;
}
