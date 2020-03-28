package com.inv.model.options;

import java.util.ArrayList;
import java.util.List;

import com.inv.dao.options.OptionsDAO;
import com.inv.vo.options.Option;

public class OptionsModel {

	public List<Option> getOptions() {
		
		List<Option> itemsList = null;
		try {
			
			OptionsDAO itemsDAO = new OptionsDAO();
			
			itemsList = itemsDAO.getOptions();
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return itemsList;
		
	}

	public Boolean createOption(Option item) {
		
		OptionsDAO itemsDAO = new OptionsDAO();
		
		Boolean isSuccessful = itemsDAO.createOption(item);
		return isSuccessful;
	}

	
}
