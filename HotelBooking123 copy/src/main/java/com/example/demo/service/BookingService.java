package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Booking;

public interface BookingService {
	public Booking addBooking(Booking booking);
	public List<Booking> getAllBookings();
	public Booking getBookingById(int bookingId);	
}