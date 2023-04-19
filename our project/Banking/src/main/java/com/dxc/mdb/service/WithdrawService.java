package com.dxc.mdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.mdb.dao.WithdrawDao;
import com.dxc.mdb.model.Withdraw;

@Service
public class WithdrawService {

	@Autowired
	WithdrawDao dao;

	public boolean addWithdraw(Withdraw withdraw) {
		Withdraw withdraw1 = dao.insert(withdraw);
		if (withdraw1 != null) {
			return true;

		}
		return false;
	}

	public List<Withdraw> getWithdraw() {
		return dao.findAll();
	}

}
