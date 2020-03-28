package com.inv.action.items;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inv.model.items.ItemsModel;
import com.inv.vo.items.Item;

public class CreateItemController extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		try {
			
			doPost(req, resp);
			
		} catch (Exception e) {
			
			System.err.println(e);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		try {
			
			String name = req.getParameter("name");
			String unit = req.getParameter("unit");
			String unitQuantity = req.getParameter("unitQuantity");
			String pricePerUnit = req.getParameter("pricePerUnit");
			String totalPrice = req.getParameter("totalPrice");
			
			
			Item item = new Item();
			item.setName(name);
			item.setUnit(unit);
			item.setUnitQuantity(new Double(unitQuantity));
			item.setPricePerUnit(new Double(pricePerUnit));
			item.setTotalPrice(new Double(totalPrice));
			
			
			ItemsModel itemsModel = new ItemsModel();
			
			Boolean isSuccessful = itemsModel.createInventoryItem(item);
			
			System.out.println("is Added Item: "+isSuccessful);
			
			List<Item> itemsList = itemsModel.getInventoryItems();
			
			req.setAttribute("itemsList", itemsList);
			
			RequestDispatcher rd = req.getRequestDispatcher("/itemsList.jsp");
			
			rd.forward(req, resp);
			
			
		} catch (Exception e) {
			
			System.err.println(e);
		}
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}
