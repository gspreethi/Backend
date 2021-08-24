package com.gift.api.doa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.gift.api.model.AddItem;

@Repository
public interface AddItemRepo extends JpaRepository<AddItem,String> {
	
//	@Query("select itemId,itemName,price,NoOfItems from AddItem a where a.itemName=?1")
//	public List getByItemName(String itemName);
//	
//	@Query("select itemId,itemName,price,NoOfItems from AddItem a where a.itemId=?1")
//	public List getByItemId(int itemId);
}