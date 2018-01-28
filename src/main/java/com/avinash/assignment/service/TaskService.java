package com.avinash.assignment.service;

import com.avinash.assignment.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
