package com.gift.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gift.api.doa.CategoryRepo;
import com.gift.api.model.Category;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepo categoryrepo;
	
	public Category setCat(Category cat) {
		categoryrepo.save(cat);
		return cat;
	}
	
	public List<Category> getCat(){
		List<Category> cat=categoryrepo.findAll();
		return cat;
	}
	
	public List getByCategories(String category)
	{
	
		List cat=categoryrepo.getByCategoryName(category);
		return cat; 
	}
	
	public List getItem()
	{
		List cat=categoryrepo.getItem();
		return cat;
	}

}
