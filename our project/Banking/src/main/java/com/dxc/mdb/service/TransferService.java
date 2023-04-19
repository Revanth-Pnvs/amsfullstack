package com.dxc.mdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.mdb.dao.TransferDao;
import com.dxc.mdb.model.Transfer;

@Service
public class TransferService {
	@Autowired
	TransferDao dao;
	
	public boolean addTransfer(Transfer t) {
		Transfer transfer = dao.insert(t);
		
		if(transfer!=null) {
			return true;
		}
		return false;
	}
	public List<Transfer>getTransfer(){
		
		return dao.findAll();
		
	}
	

}
