package com.axyya.passengerms.service;


import com.axyya.passengerms.exception.PassengersNotFoundException;
import com.axyya.passengerms.model.Passenger;
import com.axyya.passengerms.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    PassengerRepo passengerRepo;



    public List<Passenger> getPassenger()
    {
        return passengerRepo.findAll();
    }
    public Passenger getById(Long id)
    {
         Optional<Passenger> passenger= passengerRepo.findById(id);
        if (passenger.isPresent()) {
            return passenger.orElse(null);
        } else {
            throw new PassengersNotFoundException("Passenger not found exception");
        }
    }

    public List<Passenger> getGenders()
    {
        return passengerRepo.findByGender("M");
    }

    public boolean savePassenger(Passenger pass)
    {
        Passenger DbPass = passengerRepo.getPassByIdentification(pass.getIdentification());
        if(Objects.isNull(DbPass))
        {
            passengerRepo.save(pass);
            return true;
        }
        else {
            return false;
        }
    }
    public  Passenger getIdentification()
    {
        Passenger p = passengerRepo.getPassByIdentification("10101");
        return p;
    }
}
