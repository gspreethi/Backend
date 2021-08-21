package com.gift.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Category {

	@Id
	private String catId;
	private String categoryName;
	private String type;
	
	public Category() {
		super();
	}

	public Category(String catId, String categoryName, String type) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
		this.type = type;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + ", type=" + type + "]";
	}
	}
