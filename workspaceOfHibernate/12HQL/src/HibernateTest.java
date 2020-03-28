import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class HibernateTest {

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
		
		
		Query q = session.createQuery("from User");
		List<User> l = q.list();
		System.out.println(l.size());
		Iterator i1 = l.iterator();
		while (i1.hasNext()) {
			User u = (User) i1.next();
			System.out.println(u.getUserName());
			
		}
		
		SQLQuery createSQLQuery = session.createSQLQuery("select USER_ID, USER_NAME from USER_DETAILS");
		List l2 = createSQLQuery.list();
		Iterator i = l2.iterator();
		while (i.hasNext()) {
			Object[] u = (Object[]) i.next();
			System.out.println(u[1]);
			
		}
		System.out.println(l2.size());
		session.close();
		
		

	}

}
