package com.test.taskmanagement.exception;

public class TaskNotFoundException  extends RuntimeException{
    public TaskNotFoundException(String message){
        super(message);
    }

}
