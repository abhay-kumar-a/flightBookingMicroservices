package com.axyya.flightms.service;


import com.axyya.flightms.model.Flight;
import com.axyya.flightms.repository.FlightRepo;
import jdk.jfr.FlightRecorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    FlightRepo flightRepo;

      public List<Flight> getAllFlight()
      {
         List<Flight> flightList=  flightRepo.findAll();
         return flightList;
      }

      public Flight getById(Long id)
      {
          Optional<Flight> flight = flightRepo.findById(id);
          return flight.orElse(null);
      }


}
