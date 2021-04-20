package com.ims.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.ims.model.inventory;

public interface InventoryRepository extends CrudRepository<inventory, String>, MongoRepository<inventory, String>{
	
	public Iterable<inventory> deleteByItemid(String itemid);
	public inventory findByItemid(String itemid);

}
