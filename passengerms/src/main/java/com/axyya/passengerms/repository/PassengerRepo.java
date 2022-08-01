package com.axyya.passengerms.repository;

import com.axyya.passengerms.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Long> {
    List<Passenger> findByGender(String str);

    // SQL QUERY
    @Query(value = "select * from passenger_table",nativeQuery = true)
    List<Passenger> coQ();


    // take pass using identification
    @Query(value = "select p from Passenger as p where identification=:identification")
    Passenger getPassByIdentification(@Param("identification") String identification);


}
