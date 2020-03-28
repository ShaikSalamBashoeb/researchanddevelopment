import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class GetHibernateExample {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		int userId = 3;
		User user = new User();
//		user.setUserId(userId);
		user.setUserName("Mike");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		
		
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		User user2 = (User)session.get(User.class, userId);
		
		session.close();
		
		System.out.println("User Name is: "+user2.getUserName());
		
		

	}

}
