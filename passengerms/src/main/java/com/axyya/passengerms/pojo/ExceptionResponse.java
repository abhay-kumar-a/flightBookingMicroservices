package com.axyya.passengerms.pojo;

import java.time.LocalDateTime;

public class ExceptionResponse {
    String message;
    LocalDateTime localDateTime;

    public String getMessage() {
        return message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
