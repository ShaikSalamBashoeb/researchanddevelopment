import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class HibernateTest {

	public static void main(String[] args) {
		
		int userId = 7;
		
		/**
		 * Create User Object
		 */
		User user = new User();
		user.setUserName("John"+userId);
		user.setJoinDate(new Date());
		
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
		 * ex: Hibernate: insert into USER_DETAILS 
		 * 		(firstName, joinDate, rollNo, USER_NAME, USER_ID) values (?, ?, ?, ?, ?)
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
