package com.project.demo.repository;

import java.util.List;

import org.springframework.data.repository.Repository;


import com.project.demo.model.Room;

public interface RoomRepository extends Repository <Room ,Integer>{
	
	void delete(Room room);
	
	List<Room> findAll();
	
	Room findById (int room_id);
	
	Room save(Room room );
	

}
