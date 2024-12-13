package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Admin;

public interface AdminService {
	public Admin addAdmin(Admin admin);
	public List<Admin> getAllAdmins();
	public Admin getAdminById(int adminId);
	public Admin loginAdmin(Admin admin);
}