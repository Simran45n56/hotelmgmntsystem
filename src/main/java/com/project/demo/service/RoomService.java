package com.project.demo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.project.demo.model.Room;

public interface RoomService {
	
	public void create(Room room);
	
	public List<Room> findAll();
	
	public Room findById(int room_id);
	
	public void update(Room room);
	
	public void delete(int room_id);
	

	public boolean uploadImage(MultipartFile file);
	
	

}
