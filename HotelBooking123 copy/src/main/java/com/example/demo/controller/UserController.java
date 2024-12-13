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

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping()
	public  ResponseEntity<User> createUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
	}

	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("{userId}")
	public  ResponseEntity<User> getUserById(@PathVariable("UserId") int userId){
		return new ResponseEntity<User>(userService.getUserById(userId),HttpStatus.OK);
	}
	@PostMapping("login")
	public ResponseEntity<User> loginUser(@RequestBody User user) {
		return new ResponseEntity<User>(userService.loginUser(user), HttpStatus.OK);
	}
}