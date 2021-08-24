package com.gift.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gift.api.model.AddItem;
import com.gift.api.service.AddItemService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AddItemController {
	
	@Autowired
	AddItemService itemservice;
	
	
	@PostMapping(path="/setItem",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AddItem> insertItem(@RequestBody AddItem item) {

		itemservice.setItem(item);

	return new ResponseEntity<AddItem>(item,HttpStatus.OK);
	}

	@GetMapping(path="/getItem",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<AddItem>> showitem() {
		List<AddItem> item=itemservice.getItem();
		return new ResponseEntity<List<AddItem>>(item,HttpStatus.OK);
	}
	
	@GetMapping(path="/getByItems/{itemName}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List showByItems(@PathVariable String itemName) {
		List item=itemservice.getByItemName(itemName);
		return item;
	}
	
	@GetMapping(path="/getById/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List showById(@PathVariable int id) {
		List cat=itemservice.getByItemId(id);
		return cat;
	}
}