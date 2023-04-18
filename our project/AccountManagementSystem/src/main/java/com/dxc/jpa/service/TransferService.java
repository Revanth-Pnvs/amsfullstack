package com.dxc.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.jpa.dao.TransferDao;
import com.dxc.jpa.model.Transfer;

@Service
public class TransferService {

	@Autowired
	TransferDao dao;

	// add Transfer
	public boolean addTransfer(Transfer t) {
		Transfer transfer = dao.save(t);
		if (transfer != null) {
			return true;
		}
		return false;
	}

	// get Transfer
	public List<Transfer> getTransfer() {

		return dao.findAll();
	}

}
