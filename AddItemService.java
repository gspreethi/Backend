package com.gift.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gift.api.doa.AddItemRepo;
import com.gift.api.model.AddItem;

@Service
public class AddItemService {

	@Autowired
	AddItemRepo itemrepo;
	
	public AddItem setItem(AddItem item) {
		itemrepo.save(item);
		return item;
	}
	
	public List<AddItem> getItem(){
		List<AddItem> item=itemrepo.findAll();
		return item;
	}
	
	public List getByItemName(String name)
	{
	
		List cat=itemrepo.getByItemName(name);
		return cat; 
	}
	
	public List getByItemId(int id)
	{
		List cat=itemrepo.getByItemId(id);
		return cat;
	}

}