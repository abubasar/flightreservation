package com.arif.flightreservatioin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.flightreservatioin.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
