package com.gift.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AddItem {

	@Id
	private int ItemId;
	private String ItemName;
	private int price;
	private int NoOfItems;
	
	
	
	public AddItem() {
		super();
	}
	public AddItem(int itemId, String itemName, int price, int noOfItems) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		this.price = price;
		NoOfItems = noOfItems;
	}
	@Override
	public String toString() {
		return "AddItem [ItemId=" + ItemId + ", ItemName=" + ItemName + ", price=" + price + ", NoOfItems=" + NoOfItems
				+ "]";
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNoOfItems() {
		return NoOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		NoOfItems = noOfItems;
	}
	
	

	
	
	}