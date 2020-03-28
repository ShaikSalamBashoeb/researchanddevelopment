package com.eoj.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * It takes the request(symptoms of disease) from User and gives Medicine Advise
 * 
 * @author Examples Of Java
 *
 */
public class ServletController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		/**
		 * get the name from user
		 */
		String userName = req.getParameter("userName");
		
		resp.setContentType("text/html");
		
		resp.getWriter().write("Hello "+userName);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		/**
		 * get the name from user
		 */
		String userName = req.getParameter("name");
		
		resp.setContentType("text/html");
		
		resp.getWriter().write("Hello "+userName);
		
	}
}
