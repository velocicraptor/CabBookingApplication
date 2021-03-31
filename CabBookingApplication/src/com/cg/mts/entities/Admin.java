package com.cg.mts.entities;

public class Admin extends AbstractUser {
	private int adminId;

	public int getAdminId() {
		return adminId;
	}
//I just edited this to see if editing works or not. And if it can be saved for later :)
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
}
