package com.axyya.bookingservice.exception;

import com.axyya.bookingservice.pojo.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookingNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleException(BookingNotFoundException bookingNotFoundException, WebRequest webRequest)
    {
       ExceptionResponse exceptionResponse = new ExceptionResponse();
       exceptionResponse.setLocalDateTime(LocalDateTime.now());
       exceptionResponse.setMessage("Booking not Found ! Booking id is invalid");
       ResponseEntity<ExceptionResponse> entity = new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
       return entity;
    }

}
