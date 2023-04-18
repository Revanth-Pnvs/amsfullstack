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

import com.dxc.jpa.model.Transfer;
import com.dxc.jpa.service.TransferService;


@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class TransferController {
	
	@Autowired
	TransferService service;
	ResponseEntity response;
	boolean flag;
	
	@PostMapping("/addTransfer")
	public ResponseEntity<?> addTransfer(@RequestBody Transfer transfer){
		
		flag = service.addTransfer(transfer);
		if (flag) {
			response = new ResponseEntity<String>("transfer object created", HttpStatus.CREATED);
		} else {
			response = new ResponseEntity<String>("transfer object failed to create", HttpStatus.BAD_REQUEST);
		}
		return response;	
	}
	
	
	@GetMapping("/alltransfers")
	public ResponseEntity<?> getTransfer(){
		
		List<Transfer> transferList = service.getTransfer();
		
		if (transferList != null) {
			response = new ResponseEntity<List<Transfer>>(transferList, HttpStatus.OK);
		} else {
			response = new ResponseEntity<String>("failure", HttpStatus.BAD_REQUEST);
		}
		return response;
		
	}

}
