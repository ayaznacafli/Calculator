package com.ayaz;

import com.ayaz.clentsoap.AddResponse;
import com.ayaz.ws_controller.CalculatorClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contex = SpringApplication.run(TaskApplication.class, args);
	}

/*
	@Bean
	CommandLineRunner lookup(CalculatorClient addClient){
		return args -> {

			AddResponse addResponse = addClient.add(5, 10);

			System.out.println("C:"+addResponse.getAddResult());
		};
	}
*/




/*
		Date date = new Date();
		Timestamp ts=new Timestamp(date.getTime());

		System.out.println("===============");
		System.out.println(ts);
		System.out.println("===============");

		ParentRequest parentRequest = new ParentRequest();
		parentRequest.setInsertDate("2013-08-12 00:08:13");
		parentService.save(parentRequest);

 */




/*
		Date date1 = new Date();
		Date date2 = new Date();

		System.out.println("===============");
		System.out.println(date1);
		System.out.println("===============");

		ParentRequest parentRequest = new ParentRequest();
		parentRequest.setInsertDate(date1);

		TaskRequest taskRequest = new TaskRequest();
		taskRequest.setInsertDate(date2);
		taskRequest.setValue("DTO Test");
		taskRequest.setParentRequest(parentRequest);
		taskService.save(taskRequest);

 */




/*
		ParentServiceImpl parentService = contex.getBean(ParentServiceImpl.class);
		TaskServiceImpl taskService = contex.getBean(TaskServiceImpl.class);

		Parent parent = new Parent();
		parent.setInsertDate(new Date());
		parentService.save(parent);

		Task task = new Task();
		Date date2 = new Date();
		task.setInsertDate(date2);
		task.setValue("Test Create");
		task.setParent(parent);
		TaskController taskController = new TaskController();
		taskController.createTask(task);

*/
/*
		ParentServiceImpl parentService = contex.getBean(ParentServiceImpl.class);
		TaskServiceImpl taskService = contex.getBean(TaskServiceImpl.class);

		ParentDTO parentDTO = new ParentDTO();
		parentDTO.setInsertDate("2019-08-09 21:56:30");
		parentService.insertParent(parentDTO);

		TaskDTO taskDTO = new TaskDTO();
		taskDTO.setInsertDate("2018-08-09 21:56:30");
		taskDTO.setValue("Bu bir Testdir DTO");
		taskDTO.setParentDTO(parentDTO);
		taskService.insertDate(taskDTO);

		System.out.println("Finish");
*/




/*
		ParentServiceImpl parentService = contex.getBean(ParentServiceImpl.class);
		TaskServiceImpl taskService = contex.getBean(TaskServiceImpl.class);


		Date date1 = new Date();
		Date date2 = new Date();
		Date date3 = new Date();
		Date date4 = new Date();
		Parent parent1 = new Parent(date1);
		Parent parent2 = new Parent(date2);
		Parent parent3 = new Parent(date3);
		Parent parent4 = new Parent(date4);
		parentService.save(parent1);
		parentService.save(parent2);
		parentService.save(parent3);
		parentService.save(parent4);


		Task task1 = new Task(new Date(), "test 1 task", parent1);
		Task task2 = new Task(new Date(), "test 2 task", parent2);
		Task task3 = new Task(new Date(), "test 3 task", parent3);
		Task task4 = new Task(new Date(), "test 4 task", parent4);
		taskService.save(task1);
		taskService.save(task2);
		taskService.save(task3);
		taskService.save(task4);

*/
	}
