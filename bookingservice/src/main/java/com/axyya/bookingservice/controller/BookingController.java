package com.axyya.bookingservice.controller;


import com.axyya.bookingservice.model.Booking;
import com.axyya.bookingservice.pojo.BookingDetail;
import com.axyya.bookingservice.pojo.PassengerFlightBookingDetail;
import com.axyya.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    BookingService bookingService;

    @GetMapping("/allBooking")
    public List<Booking> bookingListC()
    {
        return bookingService.bookingListSer();
    }

    @GetMapping(value = "/bookingByID/{booking_id}")
    public @ResponseBody
    ResponseEntity<PassengerFlightBookingDetail> getFlightAndPassengerDetails(@PathVariable("booking_id") Long booking_id) {
        PassengerFlightBookingDetail details = bookingService.getDetailThoughId(booking_id);
        return ResponseEntity.ok(details);
    }

    @PostMapping("/saveData")
    public ResponseEntity<Booking> postData( @RequestBody BookingDetail bookingDetail)
    {
        Booking booking= bookingService.postData(bookingDetail);
        return ResponseEntity.ok().body(booking);
    }

}