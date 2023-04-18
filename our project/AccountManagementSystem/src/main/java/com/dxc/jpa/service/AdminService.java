package com.dxc.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.jpa.dao.AdminDao;
import com.dxc.jpa.model.Admin;


@Service
public class AdminService {
	
	
	@Autowired
	AdminDao dao;
	
	
	
	 // add admin
	public boolean addAdmin(Admin a) {
		Admin admin = dao.save(a);
		if (admin != null) {
			return true;
		}
		return false;
	}

	// get admin
	public List<Admin> getAdmin() {

		return dao.findAll();
	}
	 

}
