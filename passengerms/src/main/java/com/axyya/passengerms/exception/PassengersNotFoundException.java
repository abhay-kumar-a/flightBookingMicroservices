package com.axyya.passengerms.exception;

public class PassengersNotFoundException extends RuntimeException{
    String message ;

    public PassengersNotFoundException(String message) {
        this.message = message;
    }

}
