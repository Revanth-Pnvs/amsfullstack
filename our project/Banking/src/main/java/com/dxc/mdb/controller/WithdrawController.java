package com.dxc.mdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.mdb.model.Withdraw;
import com.dxc.mdb.service.WithdrawService;

@RestController
public class WithdrawController {
	@Autowired
	WithdrawService service;

	ResponseEntity response;

	boolean flag;
	@PostMapping("/addWithdraw")
	public ResponseEntity<?> addWithdraw(@RequestBody Withdraw withdraw) {
		flag = service.addWithdraw(withdraw);

		if (flag) {
			response = new ResponseEntity<String>("withdraw object created", HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>("withdraw object failure", HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	@GetMapping("/withdraws")
	public ResponseEntity<?> getWithdraw(){
		
		List<Withdraw> withdrawList = service.getWithdraw();
		
		if(withdrawList != null) {
			response = new ResponseEntity<List<Withdraw>>(withdrawList,HttpStatus.OK);
		}else {
			response = new ResponseEntity<String>("Failure",HttpStatus.BAD_REQUEST);
		}
		return response;
	}

}
