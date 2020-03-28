package com.eoj.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eoj.model.MedicineAdvise;
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
		 * get the symptom from user
		 */
		String symptom = req.getParameter("symptom");
		
		/**
		 * Model Object which has business logic which can be reusable
		 */
		MedicineAdvise advice = new MedicineAdvise();
		
		/**
		 * get the list of medicine names
		 */
		List<String> listOfMedicines = advice.getMedicine(symptom);
		
		/**
		 * set the medicine names to request
		 */
		req.getSession().setAttribute("advise", listOfMedicines);
		
		/**
		 * get the requestDispatcher and forward the request/response to 
		 * appropriate JSP page
		 */
		/*RequestDispatcher rd = req.getRequestDispatcher("advise.jsp");
		
		rd.forward(req, resp);*/
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.sendRedirect("http://localhost:8080/FirstServletProject/SecServletController.do");
	}
	
	/*public int test(int i) {
		
		return 1;
	}
	
private boolean test(int i) {
		
		return true;
	}*/
}
