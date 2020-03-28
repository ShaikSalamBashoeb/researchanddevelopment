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
import com.inv.vo.options.Option;

public class ItemsListController extends HttpServlet {

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
			
			ItemsModel itemsModel = new ItemsModel();
			
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
