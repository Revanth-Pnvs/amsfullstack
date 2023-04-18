package com.dxc.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.jpa.model.Withdraw;

@Repository
@Transactional

public interface WithdrawDao extends JpaRepository<Withdraw, Integer> {

}
