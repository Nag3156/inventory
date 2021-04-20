package com.ims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.model.inventory;
import com.ims.repository.InventoryRepository;

@Service
public class InventoryService {
    
	@Autowired
	private InventoryRepository repo;
 
	public InventoryService() {
		
	}
	public InventoryService(InventoryRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyInventory(inventory Inventory) {
		repo.save(Inventory);
	}
	
	public Iterable<inventory> showAllinventories(){
		return repo.findAll();
	}
	
	public Iterable<inventory> deleteByItemid(String itemid){
		repo.deleteByItemid(itemid);
		return repo.findAll();
	}
	
	public inventory findByItemid(String itemid) {
		return repo.findByItemid(itemid);
	}
	
}
