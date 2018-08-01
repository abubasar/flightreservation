package com.arif.flightreservatioin.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arif.flightreservatioin.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	


	
}
