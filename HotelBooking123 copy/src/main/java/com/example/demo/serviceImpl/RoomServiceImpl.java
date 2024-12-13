package com.example.demo.serviceImpl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Hotel;
import com.example.demo.model.Room;
import com.example.demo.repository.HotelRepository;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{

	private final RoomRepository roomRepository;
	private final HotelRepository hotelRepository;

    RoomServiceImpl(RoomRepository roomRepository, HotelRepository hotelRepository) {
        this.roomRepository = roomRepository;
        this.hotelRepository=hotelRepository;
    }
	
	@Override
	public Room addRoom(Room room,int hotel_id) {
		Hotel hotel=hotelRepository.findById(hotel_id).get();
		room.setHotel(hotel);
		return roomRepository.save(room);
	}

	@Override
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}

	@Override
	public Room getRoomById(int room_no) {
		return roomRepository.findById(room_no).get();
	}

}

