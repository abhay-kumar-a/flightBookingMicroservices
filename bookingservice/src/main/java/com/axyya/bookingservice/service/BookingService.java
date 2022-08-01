package com.axyya.bookingservice.service;


import com.axyya.bookingservice.exception.BookingNotFoundException;
import com.axyya.bookingservice.model.Booking;
import com.axyya.bookingservice.model.Flight;
import com.axyya.bookingservice.model.Passenger;
import com.axyya.bookingservice.pojo.BookingDetail;
import com.axyya.bookingservice.pojo.PassengerFlightBookingDetail;
import com.axyya.bookingservice.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    BookingRepository bookingRepository;
    public List<Booking> bookingListSer()
    {
        List<Booking> list  = bookingRepository.findAll();
        return list;
    }
    public PassengerFlightBookingDetail getDetailThoughId(Long id)
    {
        Optional<Booking> booking = bookingRepository.findById(id);
        if(booking.isPresent()) {
            Booking booking1 = booking.get();
            PassengerFlightBookingDetail p = new PassengerFlightBookingDetail();
            p.setPassengerList(booking1.getPassengerList());
            p.setFlight(booking1.getFlight());
            return p;
        }
        else {
            throw new BookingNotFoundException("Booking Not Found ! Booking id is invalid");

        }
    }

    public  Booking postData(BookingDetail bookingDetail)
    {
        Booking booking = new Booking();
        Flight flight =bookingDetail.getFlight();
        List<Passenger> passengers = bookingDetail.getPassengerList();
        booking.setFlight(flight);
        booking.setPassengerList(passengers);
        booking.setNoOfPassengers(bookingDetail.getNoOfPassengers());
        booking.setBookingDate(bookingDetail.getBookingDate());
        Booking b=  bookingRepository.save(booking);

        return b;
    }

}

