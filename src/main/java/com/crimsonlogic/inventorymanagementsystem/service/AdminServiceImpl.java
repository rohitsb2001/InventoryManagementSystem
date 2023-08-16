package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.repository.IAdminRepository;
@Service
public class AdminServiceImpl implements IAdminService{
@Autowired
private IAdminRepository adminRepo;
	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	@Override
	public List<Admin> viewAdmin() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

}
