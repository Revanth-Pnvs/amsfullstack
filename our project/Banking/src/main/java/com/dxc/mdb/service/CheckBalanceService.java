package com.dxc.mdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.mdb.dao.CheckBalanceDao;
import com.dxc.mdb.model.CheckBalance;



@Service
public class CheckBalanceService {
	
	@Autowired
	CheckBalanceDao dao;
	
	public boolean addCheckBalance(CheckBalance b) {
		CheckBalance balance = dao.insert(b);
		
		if(balance!=null) {
			return true;
		}
		return false;
	}
	public List<CheckBalance>getCheckBalance(){
		return dao.findAll();
		
	}
	
	
	

}
