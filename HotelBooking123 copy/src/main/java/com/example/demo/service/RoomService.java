package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Room;

public interface RoomService {
	public Room addRoom(Room room,int hotel_id);
	public List<Room> getAllRooms();
	public Room getRoomById(int roomid);	
}