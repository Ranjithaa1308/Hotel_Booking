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

import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/api/booking/")
public class BookingController {

    @Autowired
    private BookingService bookingService;
    
    @PostMapping()
	public  ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
    	Booking savedBooking = bookingService.addBooking(booking);
		return new ResponseEntity<>(savedBooking,HttpStatus.CREATED);
	}

	@GetMapping
	public List<Booking>  getAllBookings(){
		return bookingService.getAllBookings();
	}
	
	@GetMapping("{bookingId}")
	public  ResponseEntity<Booking>  getBookingById(@PathVariable int bookingId){
		return new ResponseEntity<>(bookingService.getBookingById(bookingId),HttpStatus.OK);
	}
}