package com.dxc.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.jpa.model.Admin;
import com.dxc.jpa.service.AdminService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")

public class AdminController {
	
	@Autowired
	AdminService service;
	
	ResponseEntity response;
	
	boolean flag;
	
	 @PostMapping("/addAdmin")
	public ResponseEntity<?> addAdmin(@RequestBody Admin admin){
		
		flag = service.addAdmin(admin);
		if (flag) {
			response = new ResponseEntity<String>("admin object created", HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>("admin object failed to create", HttpStatus.BAD_REQUEST);
		}
		return response;	
	}
	
	
	@GetMapping("/alladmins")
	public ResponseEntity<?> getAdmin(){
		
		List<Admin> adminList = service.getAdmin();
		
		if (adminList != null) {
			response = new ResponseEntity<List<Admin>>(adminList, HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("failure", HttpStatus.BAD_REQUEST);
		}
		return response;
		
	}
	 

}
