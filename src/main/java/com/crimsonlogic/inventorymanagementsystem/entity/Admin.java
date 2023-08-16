package com.crimsonlogic.inventorymanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="admin_details")
public class Admin {
	@Id
	@Column(name ="adminId")
	private Integer adminId;
	@Column(name ="adminUserName")
	private String adminUserName;
	@Column(name ="adminPassword")
	private String adminPassword;
	@Column(name ="adminEmail")
	private String adminEmail;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer adminId, String adminUserName, String adminPassword, String adminEmail) {
		super();
		this.adminId = adminId;
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
		this.adminEmail = adminEmail;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminUserName() {
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
}
