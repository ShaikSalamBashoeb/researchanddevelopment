import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class FirstLevelCacheWorksOnlyForObjectsTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		User u = (User) session.get(User.class, new Integer(2006));
		System.out.println(u.getUserName());
		
		u = (User) session.get(User.class, new Integer(2006));
		System.out.println(u.getUserName());
		
		session.createQuery("from User where userId=2006").list();
		session.createQuery("from User where userId=2006").list();//Three queries will be executed.
		
		
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
