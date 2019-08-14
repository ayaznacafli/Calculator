package com.ayaz.rest;

import java.util.List;


import com.ayaz.service.ParentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ayaz.domain.Task;
import com.ayaz.service.TaskService;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController()
@RequestMapping(value = "/rabita")
public class TaskController {

//	public static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	@Autowired 
	private TaskService taskService;

	@GetMapping(value = "/task",headers = "Accept=application/json")
	public List<Task> getTasks(){
		List<Task> tasks = taskService.getTasks();
		return tasks;
	}






}
