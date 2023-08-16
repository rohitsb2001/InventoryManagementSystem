package com.crimsonlogic.inventorymanagementsystem.service;

import java.util.List;

import com.crimsonlogic.inventorymanagementsystem.entity.Admin;
import com.crimsonlogic.inventorymanagementsystem.exception.AdminNotFoundException;


public interface IAdminService {
	
	public Admin  insertAdmin(Admin admin) throws AdminNotFoundException;
	public List<Admin> viewAdmin();

}
