import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.Address;
import com.eoj.model.User;


public class IncludeMultipleAddressObjToUserClass {

	public static void main(String[] args) {
		
		/**
		 * Create User Object
		 */
		User user = new User();
		user.setUserName("John");
		
		/**
		 * Create Address Object
		 */
		Address homeAdd = new Address();
		homeAdd.setCity("New York");
		homeAdd.setStreet("New Street");
		
		/**
		 * Set Home Address
		 */
		user.setHomeAddress(homeAdd);
		
		/**
		 * Create Address Object
		 */
		Address companAdd = new Address();
		companAdd.setCity("Punjagutta");
		companAdd.setStreet("Raj bhavan");
		
		/**
		 * Set Company Address
		 */
		user.setCompanyAddress(companAdd);
		
		/**
		 * Build SessionFactory from configuration
		 */
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		/**
		 * Get Session from Session Factory
		 */
		Session session = sessionFactory.openSession();
		
		/**
		 * Begin Transaction
		 */
		session.beginTransaction();
		
		/**
		 * Save the User Object to Database and 
		 * Hibernate will convert this save() to sql query
		 * ex: insert into USER_DETAILS 
		 * 		(COMPANY_CITY, COMPANY_STREET, HOME_CITY, HOME_STREET, USER_NAME, USER_ID) 
		 * 			values (?, ?, ?, ?, ?, ?)
		 */
		session.save(user);
		
		/**
		 * Commit the data to Database
		 */
		session.getTransaction().commit();
		
		/**
		 * close the session
		 */
		session.close();

	}

}
