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

import com.dxc.jpa.model.Withdraw;
import com.dxc.jpa.service.WithdrawService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")

public class WithdrawController {
	
	@Autowired
	WithdrawService service;
	
	ResponseEntity response;
	boolean flag;
	
	
	@PostMapping("/addWithdraw")
	public ResponseEntity<?> addWithdraw(@RequestBody Withdraw withdraw){
		
		flag = service.addwithDraw(withdraw);
		if (flag) {
			response = new ResponseEntity<String>("withdraw object created", HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>("withdraw object failed to create", HttpStatus.BAD_REQUEST);
		}
		return response;	
	}
	
	
	@GetMapping("/allwithdraw")
	public ResponseEntity<?> getWithdraw(){
		
		List<Withdraw> withdrawList = service.getWithdraw();
		
		if (withdrawList != null) {
			response = new ResponseEntity<List<Withdraw>>(withdrawList, HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("failure", HttpStatus.BAD_REQUEST);
		}
		return response;
		
	}
	 

}
