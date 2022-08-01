package com.axyya.flightms.repository;

import com.axyya.flightms.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepo extends JpaRepository<Flight,Long> {
}
