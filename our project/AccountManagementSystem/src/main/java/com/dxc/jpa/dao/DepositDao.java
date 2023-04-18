package com.dxc.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.jpa.model.Deposit;

public interface DepositDao extends JpaRepository<Deposit, Integer>{

}
