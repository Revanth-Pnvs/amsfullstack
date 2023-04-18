package com.dxc.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.jpa.dao.UserDao;

import com.dxc.jpa.model.User;

@Service
public class UserService {
	@Autowired
	UserDao dao;

	// add user
	public boolean addUser(User u) {
		User user = dao.save(u);
		if (user != null) {
			return true;
		}
		return false;
	}

	// get user
	public List<User> getAllUser() {

		return dao.findAll();
	}
	
	
	//delete user
		public boolean deleteUser(String accountnumber) {
	        Optional<User> optionalUser = dao.findByAccountnumber(accountnumber);
	        if (optionalUser.isPresent()) {
	            dao.delete(optionalUser.get());
	            return true;
	        }
	        return false;
	    }
	
	
}
