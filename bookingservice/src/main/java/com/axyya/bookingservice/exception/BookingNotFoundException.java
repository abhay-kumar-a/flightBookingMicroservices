package com.axyya.bookingservice.exception;

public class BookingNotFoundException extends RuntimeException{
    String message;

    public BookingNotFoundException(String message) {
        this.message = message;
    }
}
