import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class TwoSameQueriesInDifferentSessionPart2 {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery("from User where userId=2006");
		query.setCacheable(true);
		query.list();
		
		User u = (User) session.get(User.class, new Integer(2006));
		u.setUserName("Update Me");
		session.saveOrUpdate(u);
		session.getTransaction().commit();
		
		session.close();
		
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query query2 = session.createQuery("from User where userId=2006");
		query2.setCacheable(true);
		List l = query2.list();
		User u2 = (User) l.get(0);
		System.out.println(u2.getUserName());
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
