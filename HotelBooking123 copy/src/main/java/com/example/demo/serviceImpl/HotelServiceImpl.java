package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Hotel;
import com.example.demo.model.Room;
import com.example.demo.repository.HotelRepository;
import com.example.demo.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {
		if (hotel.getRoom() != null) {
			for (Room room : hotel.getRoom()) {
				room.setHotel(hotel); // Set the hotel reference for each room
			}
		}
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public Hotel updateHotel(int hotelId, Hotel hotel) {
		Optional<Hotel> existingHotelOpt = hotelRepository.findById(hotelId);
		if (existingHotelOpt.isPresent()) {
			Hotel existingHotel = existingHotelOpt.get();
			existingHotel.setHname(hotel.getHname());
			existingHotel.setHaddress(hotel.getHaddress());
			existingHotel.setHcity(hotel.getHcity());
			existingHotel.setHcontact(hotel.getHcontact());
			existingHotel.setHdescription(hotel.getHdescription());
			existingHotel.setHratings(hotel.getHratings());
			existingHotel.setHimage(hotel.getHimage());

			return hotelRepository.save(existingHotel);
		} else {
			return null;
		}
	}

	@Override
	public List<Hotel> deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);
		return hotelRepository.findAll();
	}
}