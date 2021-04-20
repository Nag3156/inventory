package com.ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.model.inventory;
import com.ims.service.InventoryService;

@RestController
public class restcontroller {
	
	@Autowired
	private InventoryService service;
	
	@PostMapping("/items")
	@Transactional
	public String registerInventory(@RequestBody inventory Inventory) {
		service.saveMyInventory(Inventory);
		return "thank you, your additional items have been added";
	}
	
	@GetMapping("/items")
	public Iterable<inventory> showAllinventories(){
		return service.showAllinventories();
	}
	
	@DeleteMapping("/items/{itemid}")
	public Iterable<inventory> deleteInventory(@PathVariable String itemid){
		return service.deleteByItemid(itemid);
	}
	
	@GetMapping("/items/{itemid}")
	public inventory searchInventory(@PathVariable String itemid) {
		return service.findByItemid(itemid);
	}

	

}
