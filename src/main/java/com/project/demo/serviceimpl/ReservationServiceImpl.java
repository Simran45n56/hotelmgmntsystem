package com.project.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.Reservation;
import com.project.demo.repository.ReservationRepository;
import com.project.demo.service.ReservationService;

@Service

public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public void create(Reservation reservation) {
		reservationRepository.save(reservation);
		
	}

}
