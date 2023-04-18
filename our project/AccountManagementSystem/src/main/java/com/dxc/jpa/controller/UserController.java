package com.dxc.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.dxc.jpa.model.User;
import com.dxc.jpa.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class UserController {
	
	@Autowired
	UserService service;
	ResponseEntity response;
	boolean flag;
	
	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody User user){
		
		flag = service.addUser(user);
		if (flag) {
			response = new ResponseEntity<String>("user object created", HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>("user object failed to create", HttpStatus.BAD_REQUEST);
		}
		return response;	
	}
	
	
	@GetMapping("/allusers")
	public ResponseEntity<?> getUser(){
		
		List<User> userList = service.getAllUser();
		
		if (userList != null) {
			response = new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("failure", HttpStatus.BAD_REQUEST);
		}
		return response;
		
	}
	@DeleteMapping("/allusers/{accountnumber}")
    public ResponseEntity<?> deleteUser(@PathVariable String accountnumber) {
        boolean isDeleted = service.deleteUser(accountnumber);
        if (isDeleted) {
            return new ResponseEntity<>("User object with account number " + accountnumber + " has been deleted", HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>("User object with account number " + accountnumber + " does not exist", HttpStatus.NOT_FOUND);
        }
    }

}
