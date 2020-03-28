package com.eoj.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class ServletConfigInitParamServlet extends HttpServlet {

	final static Logger log = Logger
			.getLogger(ServletConfigInitParamServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		Enumeration<String> initParameterNames = getServletConfig()
				.getInitParameterNames();

		while (initParameterNames.hasMoreElements()) {
			String paramName = initParameterNames.nextElement();
			
			log.debug("paramName: " + paramName);
		}
		
		log.debug("adminEmail: "+getServletConfig().getInitParameter("adminEmail"));
	}
}
