package com.avinash.assignment.repository;

import com.avinash.assignment.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository  extends CrudRepository<Task, Long> {



}
