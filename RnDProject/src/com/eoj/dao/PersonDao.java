package com.eoj.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.Employee;

public class PersonDao {


	public static boolean isCredentialExists(Employee emp) {
		
		Employee e = null;
		boolean isCredentialValid = false;
		try {
		/**
		 * Build SessionFactory from configuration
		 */
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		/**
		 * Get Session from Session Factory
		 */
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
//		e = (Employee) session.get(Employee.class, new Integer(emp.getEmplid()));
		Query q = session.createQuery("SELECT e.emplid FROM com.eoj.model.Employee e WHERE e.username = ? AND e.password = ?");
		q.setString(0, emp.getUsername());
		q.setString(1, emp.getPassword());
		
		Integer emplId = (Integer)q.uniqueResult();
		
		if(emplId != null) {
			isCredentialValid = true;
		}
		session.getTransaction().commit();
		session.close();
		
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return isCredentialValid;
	}

}
