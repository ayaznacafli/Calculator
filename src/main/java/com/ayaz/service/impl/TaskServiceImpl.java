package com.ayaz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayaz.domain.Task;
import com.ayaz.repository.TaskRepository;
import com.ayaz.service.TaskService;

@Service
public class TaskServiceImpl  implements TaskService{

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void inser(Task task) {
		taskRepository.save(task);
	}

	@Override
	public List<Task> getTasks() {
		return (List<Task>) taskRepository.findAll();
	}




/*



	@Override
	public void save(TaskRequest taskRequest)  {
		try {
			insert(taskRequest);
		}catch (Exception e){
			System.out.println("Task Save Error");
		}
	}



	private void insert(TaskRequest taskRequest) throws  Exception{
		String stringDate = taskRequest.getInsertDate();
		Date insertDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(stringDate);
		String parentDate = taskRequest.getParentRequest().getInsertDate();
		Date insertParentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(parentDate);

		Parent parent = new Parent();
		parent.setInsertDate(insertParentDate);
		parentRepository.save(parent);
		Task task = new Task();
		task.setInsertDate(insertDate);
		task.setValue(taskRequest.getValue());
		task.setParent(parent);
		taskRepository.save(task);

	}

	@Override
	public void create(TaskDTO taskDTO) {
		try {
			createTaskDTO(taskDTO);
		}catch (Exception e){
			System.out.println("create Error TaskDTO");
		}
	}

	private void createTaskDTO(TaskDTO taskDTO) throws Exception{
		String stringTaskDate = taskDTO.getInsertDate();
		Date insertDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(stringTaskDate);
		String value = taskDTO.getValue();
		int parentId = Integer.parseInt(taskDTO.getParentId());

		Parent parent = parentRepository.findById(parentId).get();

		Task task = new Task();
		task.setValue(value);
		task.setInsertDate(insertDate);
		task.setParent(parent);
		taskRepository.save(task);
	}


	@Override
	public void delete(int id) {
	   	Task task = taskRepository.findById(id).get();
	   	taskRepository.delete(task);
	}

	@Override
	public List<TaskRequest> getTasks() {
		List<Task> tasks =(List<Task>) taskRepository.findAll();
		List<TaskRequest> result = new ArrayList<>();
		for(int i=0; i< tasks.size(); i++) {
			Task task = tasks.get(i);
			ParentRequest parentRequest = new ParentRequest();
			parentRequest.setId(task.getParent().getId());
			Timestamp insertParentDate = new Timestamp(task.getParent().getInsertDate().getTime());
			parentRequest.setInsertDate(insertParentDate.toString());
			Timestamp insertTaskDate = new Timestamp(task.getInsertDate().getTime());
			result.add(new TaskRequest(task.getId(), task.getValue(), insertTaskDate.toString(),parentRequest));
		}
		return result;
	}


	@Override
	public TaskRequest getTaskById(int id) {
		Task task = taskRepository.findById(id).get();

		ParentRequest parentRequest = new ParentRequest();
		parentRequest.setId(task.getParent().getId());
		parentRequest.setInsertDate(task.getParent().getInsertDate().toString());

		TaskRequest taskRequest = new TaskRequest();
		taskRequest.setId(task.getId());
		taskRequest.setValue(task.getValue());
		taskRequest.setInsertDate(task.getInsertDate().toString());
		taskRequest.setParentRequest(parentRequest);
		return taskRequest;
	}

 */
}
