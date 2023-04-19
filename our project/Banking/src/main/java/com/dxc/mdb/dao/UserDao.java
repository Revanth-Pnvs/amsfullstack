package com.dxc.mdb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.mdb.model.User;

public interface UserDao extends MongoRepository<User, Integer>{

	
}
