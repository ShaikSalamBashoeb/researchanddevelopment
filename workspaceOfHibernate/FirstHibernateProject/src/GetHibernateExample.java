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
		
		User user = new User();
		user.setUserId(1);
		user.setUserName("Mike");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		
		
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		User user2 = (User)session.get(User.class, 1);
		
		session.close();
		
		System.out.println("User Name is: "+user2.getUserName());
		
		

	}

}
