package com.axyya.bookingservice.pojo;


import com.axyya.bookingservice.model.Flight;
import com.axyya.bookingservice.model.Passenger;

import java.util.List;

public class BookingDetail {
    private String bookingDate;
    private Integer noOfPassengers;
    private Flight flight;
    private List<Passenger> passengerList;

    @Override
    public String toString() {
        return "BookingDetail{" +
                "bookingDate='" + bookingDate + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", flight=" + flight +
                ", passengerList=" + passengerList +
                '}';
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }


    public String getBookingDate() {
        return bookingDate;
    }


    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Integer getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(Integer noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


}
