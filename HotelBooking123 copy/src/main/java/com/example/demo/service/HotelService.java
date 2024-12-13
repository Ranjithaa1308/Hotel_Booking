package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Hotel;

public interface HotelService {
	public Hotel addHotel(Hotel hotel);
	public List<Hotel> getAllHotels();
	public Hotel getHotelById(int hotelId);
	public Hotel updateHotel(int hotelId,Hotel hotel);
	public List<Hotel> deleteHotel(int hotelId);
}