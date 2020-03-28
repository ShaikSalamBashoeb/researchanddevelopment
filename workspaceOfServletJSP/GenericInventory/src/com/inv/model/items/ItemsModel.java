package com.inv.model.items;

import java.util.List;

import com.inv.dao.items.ItemsDAO;
import com.inv.vo.items.Item;
import com.inv.vo.options.Option;

public class ItemsModel {

	public List<Item> getInventoryItems() {
		
		List<Item> itemsList = null;
		try {
			
			ItemsDAO itemsDAO = new ItemsDAO();
			
			itemsList = itemsDAO.getInventory();
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return itemsList;
		
	}

	public Boolean createInventoryItem(Item item) {
		
		ItemsDAO itemsDAO = new ItemsDAO();
		
		Boolean isSuccessful = itemsDAO.createInventory(item);
		return isSuccessful;
	}

	
}
