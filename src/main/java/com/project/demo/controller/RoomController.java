package com.project.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.demo.model.Room;
import com.project.demo.service.RoomService;


@Controller
@RequestMapping("/admin/room")

public class RoomController {
	
	@Autowired
	RoomService roomservice;
	
	
	@GetMapping("/add")
	public String addRoom() {
		return"admin/addroom";
	}
	@GetMapping("/display")
	public String displayRoom(Model model) {
		List<Room> r = roomservice.findAll();
		model.addAttribute("roomlist",r);
		
		return"admin/showroom";
	}
	
	@PostMapping("/add")
	public String create(@RequestParam("room_type") String room_type,
						@RequestParam("room_rate") String room_rate,
						@RequestParam("room_description") String room_description,
						@RequestParam("room_image") MultipartFile room_image,
						@RequestParam("room_status") boolean room_status)
			 {
		roomservice.uploadImage(room_image);
		
		Room r= new Room();
		r.setRoom_type(room_type);
		r.setRoom_rate(room_rate);
		r.setRoom_description(room_description);
		r.setRoom_image(room_image.getOriginalFilename());
		r.setRoom_status(room_status);
		roomservice.create(r);
		return "redirect:/admin/room/display";
		
	}
	
	@GetMapping("/edit/{room_id}")
	public String editRoom(@PathVariable("room_id") int room_id, Model model) {
		model.addAttribute("Room",roomservice.findById(room_id));
		return "admin/editroom";
		
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Room room, Model model) {
		roomservice.update(room);
		return "redirect:/admin/room/display";
	}
	
	@GetMapping("/delete/{room_id}")
	public String delete( @PathVariable("room_id") int room_id, Model model) {
		roomservice.delete(room_id);
		return "redirect:/admin/room/display";
		
	}
	
	
	
	
	
	
	
	


}
