import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class TwoSameQueriesInDifferentSessionTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int userId = 5;
		User user = new User();
		user.setUserId(userId);
		user.setUserName("Salam55"+userId);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		User u = (User) session.get(User.class, new Integer(2006));
		System.out.println(u.getUserId());
		
		
		session.getTransaction().commit();
		
		session.close();
		
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		u = (User) session.get(User.class, new Integer(2006));//Two queries will be executed.
		System.out.println(u.getUserName());
		
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
