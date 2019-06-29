package com.project.demo.repository;

import org.springframework.data.repository.Repository;

import com.project.demo.model.Reservation;

public interface ReservationRepository extends Repository <Reservation,Integer>{
	
	Reservation save(Reservation reservation);
	

}
