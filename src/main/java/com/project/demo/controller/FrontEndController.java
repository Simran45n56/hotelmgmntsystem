package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.demo.model.Customer;
import com.project.demo.model.Reservation;
import com.project.demo.model.Room;
import com.project.demo.service.CustomerService;
import com.project.demo.service.ReservationService;
import com.project.demo.service.RoomService;

@Controller



public class FrontEndController {
	@Autowired
	RoomService roomservice;
	
	@Autowired
	ReservationService reservationservice;
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homePage(Model model) {
		 
		List<Room> r = roomservice.findAll();
		model.addAttribute("roomlist",r);
		return "frontend";
	}
	@GetMapping("/aboutus")
	public String aboutpage() {
		return "aboutus";
	}
	@GetMapping("/reservation")
	public String reservationpage() {
		return "reservation";
	}
	
	@PostMapping("/reservation")
	public String addreservationPage (@ModelAttribute Reservation reservation,Model model) {
		reservationservice.create(reservation);
		return "response";
		
		
	}
}
