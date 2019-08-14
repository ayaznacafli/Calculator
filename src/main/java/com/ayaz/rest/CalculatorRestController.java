package com.ayaz.rest;


import com.ayaz.dto.AddDTO;
import com.ayaz.dto.DivideDTO;
import com.ayaz.dto.MultiplyDTO;
import com.ayaz.dto.SubtractDTO;
import com.ayaz.service.CalculatorService;
import com.ayaz.clentsoap.*;
import com.ayaz.domain.Parent;
import com.ayaz.domain.Task;
import com.ayaz.service.ParentService;
import com.ayaz.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@RestController
@RequestMapping("/calculator")
public class CalculatorRestController {
    Logger logger = LoggerFactory.getLogger(CalculatorRestController.class);

    @Autowired
    private CalculatorService calculatorService;
    @Autowired
    private ParentService parentService;
    @Autowired
    private TaskService taskService;

    @PostMapping(value = "/add/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int add(@RequestBody @Valid AddDTO addDTO){
        logger.info("Request to JSON");
        addRequestDate(addDTO);
        return calculatorService.add(addDTO).getAddResult();
    }
    @PostMapping(value = "/divide/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int divide(@RequestBody @Valid DivideDTO divideDTO){
        logger.info("Request to JSON");
        divideRequestDate(divideDTO);
        return calculatorService.divide(divideDTO).getDivideResult();
    }
    @PostMapping(value = "/multiply/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int multiply(@RequestBody @Valid MultiplyDTO multiplyDTO){
        logger.info("Request to JSON");
        multiplyRequestDate(multiplyDTO);
        return calculatorService.multiply(multiplyDTO).getMultiplyResult();
    }
    @PostMapping(value = "/subtract/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int subtract(@RequestBody @Valid SubtractDTO subtractDTO){
        logger.info("Request to JSON");
        subtractRequestDate(subtractDTO);
        return calculatorService.subtract(subtractDTO).getSubtractResult();
    }




















    private void addRequestDate(AddDTO addDTO){
        Date date = new Date();
        Parent parent = new Parent();
        parent.setInsertDate(date);
        parentService.insert(parent);
        Task task =new Task();
        task.setInsertDate(date);
        task.setParent(parent);
        task.setValue("intA:"+addDTO.getIntA()+"intB:"+addDTO.getIntB());
        taskService.inser(task);
    }
    private void subtractRequestDate(SubtractDTO subtractDTO){
        Date date = new Date();
        Parent parent = new Parent();
        parent.setInsertDate(date);
        parentService.insert(parent);
        Task task =new Task();
        task.setInsertDate(date);
        task.setParent(parent);
        task.setValue("intA:"+subtractDTO.getIntA()+"intB:"+subtractDTO.getIntB());
        taskService.inser(task);
    }
    private void divideRequestDate(DivideDTO divideDTO){
        Date date = new Date();
        Parent parent = new Parent();
        parent.setInsertDate(date);
        parentService.insert(parent);
        Task task =new Task();
        task.setInsertDate(date);
        task.setParent(parent);
        task.setValue("intA:"+divideDTO.getIntA()+"intB:"+divideDTO.getIntB());
        taskService.inser(task);
    }
    public void multiplyRequestDate(MultiplyDTO multiplyDTO){
        Date date = new Date();
        Parent parent = new Parent();
        parent.setInsertDate(date);
        parentService.insert(parent);
        Task task =new Task();
        task.setInsertDate(date);
        task.setParent(parent);
        task.setValue("intA:"+multiplyDTO.getIntA()+"intB:"+multiplyDTO.getIntB());
        taskService.inser(task);
    }





}
