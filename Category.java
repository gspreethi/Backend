package com.gift.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Category {

	@Id
	private int catId;
	private String categoryName;
	private String item;
	
	public Category() {
		super();
	}

	public Category(int catId, String categoryName, String item) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
		this.item = item;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + ", item=" + item + "]";
	}
	}
