package com.ayaz.service;


import java.util.List;

import com.ayaz.domain.Task;


public interface TaskService {

	void inser(Task task);
	List<Task> getTasks();



}
