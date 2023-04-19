package com.dxc.mdb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.mdb.model.Transfer;

public interface TransferDao extends MongoRepository<Transfer, Integer>{

}
