package com.arif.flightreservatioin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.flightreservatioin.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
