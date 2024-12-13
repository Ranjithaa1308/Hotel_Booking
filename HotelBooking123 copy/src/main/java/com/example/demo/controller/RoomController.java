package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Room;
import com.example.demo.service.RoomService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/api/room/")
public class RoomController {

    @Autowired
    private  RoomService roomService;
	//private Room room;
    
    @PostMapping("{hotel_id}")
	public  ResponseEntity<Room> addRoom(@PathVariable int hotel_id,@RequestBody Room room){
		return new ResponseEntity<Room>(roomService.addRoom(room,hotel_id),HttpStatus.CREATED);
	}

	@GetMapping
	public List<Room>  getAllRooms()
	{
		return roomService.getAllRooms();
	}
	
	@GetMapping("{room_id}")
	public  ResponseEntity<Room>  getRoomById(@PathVariable("room_id") int roomid)
	{
		System.out.println("in room controller"+roomid);
		return new ResponseEntity<Room>(roomService.getRoomById(roomid),HttpStatus.OK);
	}
}