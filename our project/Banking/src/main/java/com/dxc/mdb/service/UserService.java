package com.dxc.mdb.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.mdb.dao.UserDao;
import com.dxc.mdb.model.User;

@Service
public class UserService {
	@Autowired
	UserDao dao;
	
	//Add User
	public boolean addUser(User u) {
		User user = dao.insert(u);
		if(user!=null) {
			return true;
			
		}
		return false;
	}
	
	//Get User
	public List<User>getUser(){
		return dao.findAll();
	}
	
	//Delete User
	public boolean deleteUser(int id) {
        Optional<User> optionalUser = dao.findById(id);
        if (optionalUser.isPresent()) {
            dao.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
	
	//Update User
	public boolean updateUser(User user) {
        Optional<User> optionalUser = dao.findById(user.getUserId());
        if (optionalUser.isPresent()) {
            dao.save(user);
            return true;
        } else {
            return false;
        }
    }
	
}
