package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() {
		return null;
	}

	@Override
	public Admin getAdminById(int adminId) {
		return null;
	}

	@Override
	public Admin loginAdmin(Admin admin) {
		return adminRepository.findByAdminNameAndAdminPassword(admin.getAdminName(), admin.getAdminPassword());
	}
}