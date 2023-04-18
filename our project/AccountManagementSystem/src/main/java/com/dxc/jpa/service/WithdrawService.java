package com.dxc.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.jpa.dao.WithdrawDao;

import com.dxc.jpa.model.Withdraw;

@Service
public class WithdrawService {
	
	@Autowired
	WithdrawDao dao;
	
	//add Withdraw
	public boolean addwithDraw(Withdraw w) {
		Withdraw withdraw = dao.save(w);
		if (withdraw != null) {
			return true;
		}
		return false;
	}
	
	//get Withdraw
		public List<Withdraw> getWithdraw() {

			return dao.findAll();
		}
	

}
