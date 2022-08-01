package com.axyya.passengerms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PassengerMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(PassengerMSApplication.class, args);
    }
}
