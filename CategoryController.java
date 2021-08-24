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
import com.gift.api.model.Category;
import com.gift.api.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {
	
	@Autowired
	CategoryService categoryservice;
	
	
	@PostMapping(path="/setCat",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Category> insertCat(@RequestBody Category cat) {

		categoryservice.setCat(cat);

	return new ResponseEntity<Category>(cat,HttpStatus.OK);
	}

	@GetMapping(path="/getCat",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> showcat() {
		List<Category> cat=categoryservice.getCat();
		return new ResponseEntity<List<Category>>(cat,HttpStatus.OK);
	}
	
	@GetMapping(path="/getByCategories/{category}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List showByCategories(@PathVariable String category) {
		List cat=categoryservice.getByCategories(category);
		return cat;
	}
	
	@GetMapping(path="/getType",produces=MediaType.APPLICATION_JSON_VALUE)
	public List showType() {
		List cat=categoryservice.getItem();
		return cat;
	}
}
