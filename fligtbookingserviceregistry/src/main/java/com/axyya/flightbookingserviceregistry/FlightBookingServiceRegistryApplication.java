package com.axyya.flightbookingserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FlightBookingServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingServiceRegistryApplication.class, args);
	}

}
