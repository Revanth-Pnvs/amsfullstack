package com.dxc.mdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.mdb.model.User;
import com.dxc.mdb.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;

	ResponseEntity response;
	boolean flag;

	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody User user) {
		flag = service.addUser(user);

		if (flag) {
			response = new ResponseEntity<String>("user object created", HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>("user object failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@GetMapping("/users")
	public ResponseEntity<?> getUser() {

		List<User> userList = service.getUser();

		if (userList != null) {
			response = new ResponseEntity<List<User>>(userList, HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable int id) {
		boolean flag = service.deleteUser(id);
		if (flag) {
			response = new ResponseEntity<String>("User deleted", HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@PutMapping("/users")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		boolean flag = service.updateUser(user);
		if (flag) {
			response = new ResponseEntity<String>("User updated", HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("User not found", HttpStatus.NOT_FOUND);
		}
		return response;
	}

}
