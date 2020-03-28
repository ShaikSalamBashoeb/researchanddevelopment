package com.inv.action.options;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inv.model.options.OptionsModel;
import com.inv.vo.options.Option;

public class OptionsListController extends HttpServlet {

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
			
			OptionsModel itemsModel = new OptionsModel();
			
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
