package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Hotel;
import com.example.demo.service.HotelService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/hotel/")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
		return new ResponseEntity<>(hotelService.addHotel(hotel), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Hotel> getAllHotels() {
		return hotelService.getAllHotels();
	}

	@GetMapping("{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable int hotelId) {
	    return new ResponseEntity<>(hotelService.getHotelById(hotelId), HttpStatus.OK);
	}

	@PutMapping("{hotelId}")
	public ResponseEntity<Hotel> updateHotel(@PathVariable int hotelId, @RequestBody Hotel hotel) {
	    return new ResponseEntity<>(hotelService.updateHotel(hotelId, hotel), HttpStatus.OK);
	}

	@DeleteMapping("{hotelId}")
	public ResponseEntity<List<Hotel>> deleteHotel(@PathVariable int hotelId) {
	    return new ResponseEntity<>(hotelService.deleteHotel(hotelId), HttpStatus.OK);
	}
}
