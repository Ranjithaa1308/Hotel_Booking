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

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/admin/")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@PostMapping()
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.addAdmin(admin), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Admin> getAllAdmins() {
		return adminService.getAllAdmins();
	}

	@GetMapping("{adminid}")
	public ResponseEntity<Admin> getAdminById(@PathVariable("adminId") int adminid) {
		return new ResponseEntity<Admin>(adminService.getAdminById(adminid), HttpStatus.OK);
	}

	@PostMapping("login")
	public ResponseEntity<Admin> loginAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<Admin>(adminService.loginAdmin(admin), HttpStatus.OK);
	}
}