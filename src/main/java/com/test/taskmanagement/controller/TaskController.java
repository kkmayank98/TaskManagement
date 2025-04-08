package com.test.taskmanagement.controller;

import com.test.taskmanagement.model.Task;
import com.test.taskmanagement.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    public List<Task> getAllTask(){
        return taskService.getAllTasks();
    }


}
