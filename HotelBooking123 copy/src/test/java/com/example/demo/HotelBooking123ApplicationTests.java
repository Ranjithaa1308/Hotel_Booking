package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootTest
class HotelBooking123ApplicationTests {
	
	@Autowired
	public UserRepository userRepository;

	@Test
	void User() {
		User user=new User();
		user.setName("Ranjithaa");
		user.setEmail("ranjithaa@gmail");
		user.setPassword("Passw0rd");
		assertNotNull(userRepository.save(user));
	}

}
