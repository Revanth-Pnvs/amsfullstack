package com.dxc.mdb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.mdb.model.CheckBalance;



public interface CheckBalanceDao extends MongoRepository<CheckBalance,Long>{

}
