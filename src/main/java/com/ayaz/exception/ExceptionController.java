package com.ayaz.exception;


import com.ayaz.enums.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class ExceptionController {


    @ExceptionHandler(MyException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error getIdExb(MyException e){
        String message = e.getMessage();
        Error error = new Error();
        error.setCode(10);
        error.setMessage(message);
        return  error;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error validateErr(MethodArgumentNotValidException e){
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        Error error = new Error();
        error.setCode(ErrorCode.VALIDATION_ERROR);
        error.setMessage(message);
        return  error;
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error numberFormatEx(MethodArgumentNotValidException e){
        String message = e.getBindingResult().getFieldError().getDefaultMessage();
        Error error = new Error();
        error.setCode(ErrorCode.NUMBER_FORMAT_EXCEPTION);
        error.setMessage(message);
        return  error;
    }

}
