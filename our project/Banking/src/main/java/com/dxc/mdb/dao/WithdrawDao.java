package com.dxc.mdb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.mdb.model.Withdraw;

public interface WithdrawDao extends MongoRepository<Withdraw, Integer>{

}
