import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.Address;
import com.eoj.model.User;


public class HibernateTest {

	public static void main(String[] args) {
		
		/**
		 * Create User Object
		 */
		User user = new User();
		user.setUserName("John");
		
		/**
		 * Create Address Object
		 */
		Address a = new Address();
		a.setCity("New York");
		a.setStreet("Salala");
		
		user.setAddress(a);
		
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
		 * 		(city, street, rollNo, USER_NAME, USER_ID) values (?, ?, ?, ?, ?)
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
