package com.dxc.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.jpa.model.Admin;

public interface AdminDao extends JpaRepository<Admin, String>{

}
