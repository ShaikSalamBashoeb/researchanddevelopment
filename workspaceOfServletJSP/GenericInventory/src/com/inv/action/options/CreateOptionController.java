package com.inv.action.options;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inv.model.options.OptionsModel;
import com.inv.vo.options.Option;

public class CreateOptionController extends HttpServlet {

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
			String unitQuantity = req.getParameter("unitQuantity");
			String unit = req.getParameter("unit");
			String pricePerUnit = req.getParameter("pricePerUnit");
			String totalPrice = req.getParameter("totalPrice");
			
			Option item = new Option();
			item.setName(name);
			item.setUnitQuantity(new Double(unitQuantity));
			item.setUnit(unit);
			item.setPricePerUnit(new Double(pricePerUnit));
			item.setTotalPrice(new Double(totalPrice));
			
			OptionsModel itemsModel = new OptionsModel();
			
			Boolean isSuccessful = itemsModel.createOption(item);
			
			System.out.println("is Added Item: "+isSuccessful);
			
			List<Option> optionsList = itemsModel.getOptions();
			
			req.setAttribute("optionsList", optionsList);
			
			RequestDispatcher rd = req.getRequestDispatcher("/optionsList.jsp");
			
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
