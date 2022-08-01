package com.axyya.bookingservice.pojo;

import com.axyya.bookingservice.model.Flight;
import com.axyya.bookingservice.model.Passenger;

import java.util.List;

public class PassengerFlightBookingDetail {

    List<Passenger> passengerList;
    Flight flight;
    
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}
