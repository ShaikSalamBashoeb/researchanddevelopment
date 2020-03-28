import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class InsertData {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int userId = 5;
		User user = null;
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		/*for (int i = 0; i < 1000; i++) {
			
			user = new User();
			user.setUserId(i);
			user.setUserName("Salam"+userId);
			
			session.save(user);
			
		}*/
		
		Query q = session.createQuery("select max(userId) from User");
		/*q.setFirstResult(5);
		q.setMaxResults(5);*/
		List<Integer> l = (List<Integer>)q.list();
		System.out.println(l.size());
		session.getTransaction().commit();
		session.close();
		
		

	}

}
