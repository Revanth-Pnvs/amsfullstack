package com.dxc.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.jpa.dao.DepositDao;
import com.dxc.jpa.model.Deposit;

@Service
public class DepositService {

	@Autowired
	DepositDao dao;

	// add deposit
	public boolean addDeposit(Deposit d) {
		Deposit deposit = dao.save(d);
		if (deposit != null) {
			return true;
		}
		return false;
	}

	// get deposit
	public List<Deposit> getDeposit() {

		return dao.findAll();
	}

}
