package com.ims.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "InventoryDetails")
public class inventory {
	
	@Id
	private String itemid;
	private String lunch;
	private String dinner;
	private String drinks;
	private String desert;
	private String additional;
	
	public inventory() {
		
	}
	public inventory(String itemid, String lunch, String dinner, String drinks, String desert, String additional) {
		super();
		this.itemid = itemid;
		this.lunch = lunch;
		this.dinner = dinner;
		this.drinks = drinks;
		this.desert = desert;
		this.additional = additional;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public String getDrinks() {
		return drinks;
	}
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}
	public String getDesert() {
		return desert;
	}
	public void setDesert(String desert) {
		this.desert = desert;
	}
	public String getAdditional() {
		return additional;
	}
	public void setAdditional(String additional) {
		this.additional = additional;
	}
	
	

	
}
