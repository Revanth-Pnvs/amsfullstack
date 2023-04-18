package com.dxc.jpa.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.jpa.model.User;

@Repository
@Transactional

public interface UserDao extends JpaRepository<User, String>{

	Optional<User> findByAccountnumber(String accountnumber);
	
}
