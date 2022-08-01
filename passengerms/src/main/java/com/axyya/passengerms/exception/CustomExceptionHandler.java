package com.axyya.passengerms.exception;
import com.axyya.passengerms.pojo.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PassengersNotFoundException.class)
    public ResponseEntity<ExceptionResponse > handleException(PassengersNotFoundException passengersNotFoundException,WebRequest webRequest)
    {
        ExceptionResponse exceptionResponse = new ExceptionResponse();
        exceptionResponse.setLocalDateTime(LocalDateTime.now());
        exceptionResponse.setMessage("Passenger not found exception");
        ResponseEntity<ExceptionResponse> entity = new ResponseEntity<>(exceptionResponse,HttpStatus.NOT_FOUND);
        return entity;
    }

}
