package com.ayaz.rest;


import com.ayaz.clentsoap.AddResponse;
import com.ayaz.clentsoap.DivideResponse;
import com.ayaz.clentsoap.MultiplyResponse;
import com.ayaz.clentsoap.SubtractResponse;
import com.ayaz.dto.WebDTO;
import com.ayaz.service.CalculatorService;
import com.ayaz.domain.Parent;
import com.ayaz.domain.Task;
import com.ayaz.service.ParentService;
import com.ayaz.service.TaskService;
import com.ayaz.service.utils.LogIdGenerator;
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
    public int add(@RequestBody @Valid WebDTO webDTO){
        int uId = LogIdGenerator.generateId();
        logger.info("Call {}. Request to JSON", uId);
        AddResponse response = calculatorService.add(webDTO, uId);
        insertDate(webDTO,response.getAddResult());
        return response.getAddResult();
    }
    @PostMapping(value = "/divide/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int divide(@RequestBody @Valid WebDTO webDTO){
        int uId = LogIdGenerator.generateId();
        logger.info("Call {}. Request to JSON", uId);
        DivideResponse response = calculatorService.divide(webDTO, uId);
        insertDate(webDTO,response.getDivideResult());
        return response.getDivideResult();
    }
    @PostMapping(value = "/multiply/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int multiply(@RequestBody @Valid WebDTO webDTO){
        int uId = LogIdGenerator.generateId();
        logger.info("Call {}. Request to JSON", uId);
        MultiplyResponse response = calculatorService.multiply(webDTO, uId);
        insertDate(webDTO,response.getMultiplyResult());
        return response.getMultiplyResult();
    }
    @PostMapping(value = "/subtract/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public int subtract(@RequestBody @Valid WebDTO webDTO){
        int uId = LogIdGenerator.generateId();
        logger.info("Call {}. Request to JSON", uId);
        SubtractResponse response =calculatorService.subtract(webDTO, uId);
        insertDate(webDTO,response.getSubtractResult());
        return response.getSubtractResult();
    }
    private void insertDate(WebDTO webDTO,int response){
        Date date = new Date();
        Parent parent = new Parent();
        parent.setInsertDate(date);
        parentService.insert(parent);
        Task task =new Task();
        task.setInsertDate(date);
        task.setParent(parent);
        task.setValue(webDTO.getIntA()+"+"+webDTO.getIntB()+"="+response);
        taskService.inser(task);
    }


}
