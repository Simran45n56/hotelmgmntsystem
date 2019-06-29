package com.project.demo.serviceimpl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.demo.model.Room;
import com.project.demo.repository.RoomRepository;
import com.project.demo.service.RoomService;

@Service

public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomRepository roomrepository;
	
	 private static final String UPLOAD_DIR = "C:\\Users\\Siron\\Desktop\\springhmsImages";

	@Override
	public void create(Room room) {
		// TODO Auto-generated method stub
		roomrepository.save(room);
		
	}

	@Override
	public List<Room> findAll() {
		// TODO Auto-generated method stub
		return roomrepository.findAll();
	}

	@Override
	public Room findById(int room_id) {
		// TODO Auto-generated method stub
		return roomrepository.findById(room_id);
	}

	@Override
	public void update(Room room) {
		// TODO Auto-generated method stub
		roomrepository.save(room);
		
	}

	@Override
	public void delete(int room_id) {
		// TODO Auto-generated method stub
		Room room= findById(room_id);
		if(room!=null) {
			roomrepository.delete(room);
		}
			
		
	}

	@Override
	public boolean uploadImage(MultipartFile file) {
		  boolean status = false;
	        
	        File dir = new File(UPLOAD_DIR + File.separator +"rooms");
	        if(!dir.exists()){
	            dir.mkdirs();
	        }
	        
	        String fileName = file.getOriginalFilename();
	        System.out.println(fileName);
	        String uploadFile = fileName.substring(fileName.lastIndexOf('\\')+1);
//	        fileName.subString(2);
	        System.out.println(uploadFile);
	        String uploadPath= dir.getAbsolutePath();
	        File upload = new File(uploadPath+File.separator+uploadFile);
	        
	        try{
	            file.transferTo(upload);
	            status = true;
	            
	        }catch(Exception e){
	            System.out.println(e);
	        }
	        
	        return status;
	}

	

}
