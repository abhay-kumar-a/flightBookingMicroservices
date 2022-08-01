package com.axyya.flightms.model;

import javax.persistence.*;

@Entity
@Table(name ="Flight")
public class Flight {

    @Id
    @Column(name ="flight_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long flightNo;

    @Column (name = "flight_carrierName")
    String carrierName;
    @Column (name ="flight_model")
    String flightModel;
    @Column (name = "flight_seatCapacity")
    Long seatCapacity;

    public Long getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(Long flightNo) {
        this.flightNo = flightNo;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getFlightModel() {
        return flightModel;
    }

    public void setFlightModel(String flightModel) {
        this.flightModel = flightModel;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNo=" + flightNo +
                ", carrierName='" + carrierName + '\'' +
                ", flightModel='" + flightModel + '\'' +
                ", seatCapacity=" + seatCapacity +
                '}';
    }

    public Long getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(Long seatCapacity) {
        this.seatCapacity = seatCapacity;
    }



}

