package com.ayaz.repository;

import org.springframework.data.repository.CrudRepository;

import com.ayaz.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
