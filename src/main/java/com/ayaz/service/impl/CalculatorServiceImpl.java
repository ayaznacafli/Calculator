package com.ayaz.service.impl;


import com.ayaz.dto.AddDTO;
import com.ayaz.dto.DivideDTO;
import com.ayaz.dto.MultiplyDTO;
import com.ayaz.dto.SubtractDTO;
import com.ayaz.service.CalculatorService;
import com.ayaz.clentsoap.*;
import com.ayaz.ws_controller.CalculatorClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    Logger logger = LoggerFactory.getLogger(CalculatorServiceImpl.class);

    @Autowired
    private CalculatorClient calculatorClient;


    @Override
    public AddResponse add(AddDTO addDTO) {
        logger.info("Request to SOAP");
        Add add = new Add();
        add.setIntA(Integer.parseInt(addDTO.getIntA()));
        add.setIntB(Integer.parseInt(addDTO.getIntB()));
        return calculatorClient.add(add.getIntA(),add.getIntB());
    }

    @Override
    public DivideResponse divide(DivideDTO divideDTO) {
        logger.info("Request to SOAP");
        Divide divide = new Divide();
        divide.setIntA(Integer.parseInt(divideDTO.getIntA()));
        divide.setIntB(Integer.parseInt(divideDTO.getIntB()));
        return calculatorClient.divide(divide.getIntA(),divide.getIntB());
    }

    @Override
    public MultiplyResponse multiply(MultiplyDTO multiplyDTO) {
        logger.info("Request to SOAP");
        Multiply multiply = new Multiply();
        multiply.setIntA(Integer.parseInt(multiplyDTO.getIntA()));
        multiply.setIntB(Integer.parseInt(multiplyDTO.getIntB()));
        return calculatorClient.multiply(multiply.getIntA(),multiply.getIntB());
    }

    @Override
    public SubtractResponse subtract(SubtractDTO subtractDTO) {
        logger.info("Request to SOAP");
        Subtract subtract = new Subtract();
        subtract.setIntA(Integer.parseInt(subtractDTO.getIntA()));
        subtract.setIntB(Integer.parseInt(subtractDTO.getIntB()));
        return calculatorClient.subtract(subtract.getIntA(),subtract.getIntB());
    }
}
