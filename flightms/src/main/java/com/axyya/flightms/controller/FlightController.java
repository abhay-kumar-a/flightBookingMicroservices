package com.axyya.flightms.controller;

import com.axyya.flightms.FeignClient;
import com.axyya.flightms.model.Flight;
import com.axyya.flightms.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FeignClient feignClient;

    @GetMapping("/getPass")
    public List getData()
    {
        return feignClient.getDataPassenger();
    }

    @GetMapping("/getPassById/{pass_id}")
    public String getDataById(@PathVariable Long pass_id)
    {
        return feignClient.getPassById(pass_id);
    }

    @GetMapping("/allFlight")
    public List<Flight> getAllFlight()
    {
       return flightService.getAllFlight();
    }

    @GetMapping("/byId/{flight_id}")
     public ResponseEntity<Flight> getById(@PathVariable Long flight_id)
    {
        return ResponseEntity.ok().body(flightService.getById(flight_id));
    }

}
