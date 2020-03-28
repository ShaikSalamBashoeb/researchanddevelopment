package com.eoj.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eoj.vo.Dog;

public class ServletContextListenerTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Dog dog = (Dog)getServletContext().getAttribute("dog");
		
		PrintWriter out = resp.getWriter();
		
		out.println("Name of Dog: "+dog.getName());
		
		
	}
}
