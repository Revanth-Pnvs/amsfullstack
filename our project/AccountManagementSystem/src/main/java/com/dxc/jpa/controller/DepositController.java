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

import com.dxc.jpa.model.Deposit;
import com.dxc.jpa.service.DepositService;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class DepositController {

	@Autowired
	DepositService service;

	ResponseEntity response;
	boolean flag;

	@PostMapping("/addDeposit")
	public ResponseEntity<?> addDeposit(@RequestBody Deposit deposit) {

		flag = service.addDeposit(deposit);
		if (flag) {
			response = new ResponseEntity<String>("deposit object created", HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>("deposit object failed to create", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@GetMapping("/alldeposit")
	public ResponseEntity<?> getDeposit() {

		List<Deposit> depositList = service.getDeposit();

		if (depositList != null) {
			response = new ResponseEntity<List<Deposit>>(depositList, HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("failure", HttpStatus.BAD_REQUEST);
		}
		return response;

	}

}
