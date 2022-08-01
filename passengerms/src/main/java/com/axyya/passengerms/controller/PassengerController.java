package com.axyya.passengerms.controller;


import com.axyya.passengerms.model.Passenger;
import com.axyya.passengerms.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {


    @Autowired
    PassengerService passengerService;

    @GetMapping("/allPassenger")
    public List<Passenger> getPassenger()
    {
        return passengerService.getPassenger();
    }

    @GetMapping("/byId/{pass_id}")
    public  Passenger passenger(@PathVariable Long pass_id)
    {
        return passengerService.getById(pass_id);
    }
    @GetMapping("/gender")
    public List<Passenger> getGender()
    {
        return passengerService.getGenders();
    }

    @PostMapping("/savePass")
    public ResponseEntity<String> postData(@RequestBody Passenger passenger)
    {
        if(passengerService.savePassenger(passenger))
        {
            return ResponseEntity.ok().body(passenger.toString());
        }
        else {
            return ResponseEntity.badRequest().body("Passenger already exist");
        }
    }
    @GetMapping("/identification")
    public Passenger getI()
    {
        return passengerService.getIdentification();
    }

}
