package com.axyya.bookingservice.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="booking_table")
public class Booking {

    @Id
    @Column(name ="booking_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;
    @Column(name = "booking_date")
    private String bookingDate;
    @Column (name = "noOFPassengers")
    private Integer noOfPassengers;

    //one to one join between booking to flight
    @OneToOne(targetEntity = Flight.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_id1",referencedColumnName = "flight_id")
    Flight flight;

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @OneToMany(targetEntity = Passenger.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_id",referencedColumnName = "booking_id")
    List<Passenger> passengerList;

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }


    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
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


}