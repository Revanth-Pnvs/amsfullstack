package com.dxc.mdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.mdb.model.CheckBalance;
import com.dxc.mdb.service.CheckBalanceService;

@RestController
public class CheckBalanceController {
	@Autowired
	CheckBalanceService service;
	ResponseEntity response;
	boolean flag;
	
	@PostMapping("/addCheckBalance")
	public ResponseEntity<?>addCheckBalance(@RequestBody CheckBalance balance){
		
		flag=service.addCheckBalance(balance);
		
		if(flag) {
			response = new ResponseEntity<String>("checkbalance object created",HttpStatus.CREATED);
		}
		else {
			response = new ResponseEntity<String>("checkbalance object Failure",HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@GetMapping("/balance")
	public ResponseEntity<?>getTransfer(){
		
		List<CheckBalance> checkBalance = service.getCheckBalance();
		
		if(checkBalance != null) {
			response = new ResponseEntity<List<CheckBalance>>(checkBalance,HttpStatus.OK);
		}else {
			response = new ResponseEntity<String>("Failure",HttpStatus.BAD_REQUEST);
		}
		return response;
		
	}
	

}
