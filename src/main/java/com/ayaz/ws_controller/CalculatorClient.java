package com.ayaz.ws_controller;

import com.ayaz.clentsoap.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;


public class CalculatorClient extends WebServiceGatewaySupport {

    Logger logger = LoggerFactory.getLogger(CalculatorClient.class);


    @Value("${spring.webservice.soapAction.add}")
    private String soapActionAdd;

    @Value("${spring.webservice.soapAction.divide}")
    private String soapActionDivide;

    @Value("${spring.webservice.soapAction.multiply}")
    private String soapActionMultuply;

    @Value("${spring.webservice.soapAction.subtract}")
    private String soapActionSubtract;

    public AddResponse add(int intA, int intB, int uId){
        logger.info("Call {}. Response to SOAP",uId);
        ObjectFactory objectFactory = new ObjectFactory();
        Add add =  objectFactory.createAdd();
        add.setIntA(intA);
        add.setIntB(intB);
        AddResponse addResponse= (AddResponse) getWebServiceTemplate().marshalSendAndReceive(add,
                message ->((SoapMessage) message).setSoapAction(soapActionAdd));
        return addResponse;
    }
    public DivideResponse divide(int intA, int intB,int uId){
        logger.info("Call {}. Response to SOAP",uId);
        ObjectFactory objectFactory = new ObjectFactory();
        Divide divide =  objectFactory.createDivide();
        divide.setIntA(intA);
        divide.setIntB(intB);
        DivideResponse divideResponse= (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(divide,
                message ->((SoapMessage) message).setSoapAction(soapActionDivide));
        return divideResponse;
    }

    public MultiplyResponse multiply(int intA, int intB,int uId){
        logger.info("Call {}. Response to SOAP",uId);
        ObjectFactory objectFactory = new ObjectFactory();
        Multiply multiply =  objectFactory.createMultiply();
        multiply.setIntA(intA);
        multiply.setIntB(intB);
        MultiplyResponse multiplyResponse= (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(multiply,
                message ->((SoapMessage) message).setSoapAction(soapActionMultuply));
        return multiplyResponse;
    }
    public SubtractResponse subtract(int intA, int intB,int uId){
        logger.info("Call {}. Response to SOAP",uId);
        ObjectFactory objectFactory = new ObjectFactory();
        Subtract subtract =  objectFactory.createSubtract();
        subtract.setIntA(intA);
        subtract.setIntB(intB);
        SubtractResponse subtractResponse= (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(subtract,
                message ->((SoapMessage) message).setSoapAction(soapActionSubtract));
        return subtractResponse;
    }


}
