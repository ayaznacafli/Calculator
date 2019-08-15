package com.ayaz.service.impl;


import com.ayaz.dto.WebDTO;
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
    public AddResponse add(WebDTO webDTO, int uId) {
        logger.info("Call {}. Request to SOAP",uId);
        Add add = new Add();
        add.setIntA(Integer.parseInt(webDTO.getIntA()));
        add.setIntB(Integer.parseInt(webDTO.getIntB()));
        return calculatorClient.add(add.getIntA(),add.getIntB(),uId);
    }

    @Override
    public DivideResponse divide(WebDTO webDTO, int uId) {
        logger.info("Call {}. Request to SOAP",uId);
        Divide divide = new Divide();
        divide.setIntA(Integer.parseInt(webDTO.getIntA()));
        divide.setIntB(Integer.parseInt(webDTO.getIntB()));
        return calculatorClient.divide(divide.getIntA(),divide.getIntB(),uId);
    }

    @Override
    public MultiplyResponse multiply(WebDTO webDTO, int uId) {
        logger.info("Call {}. Request to SOAP",uId);
        Multiply multiply = new Multiply();
        multiply.setIntA(Integer.parseInt(webDTO.getIntA()));
        multiply.setIntB(Integer.parseInt(webDTO.getIntB()));
        return calculatorClient.multiply(multiply.getIntA(),multiply.getIntB(),uId);
    }

    @Override
    public SubtractResponse subtract(WebDTO webDTO, int uId) {
        logger.info("Call {}. Request to SOAP",uId);
        Subtract subtract = new Subtract();
        subtract.setIntA(Integer.parseInt(webDTO.getIntA()));
        subtract.setIntB(Integer.parseInt(webDTO.getIntB()));
        return calculatorClient.subtract(subtract.getIntA(),subtract.getIntB(),uId);
    }
}
