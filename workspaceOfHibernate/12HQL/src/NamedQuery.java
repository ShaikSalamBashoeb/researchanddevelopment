import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.User;


public class NamedQuery {

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
//		String str = "1; select * from User";
		String str = "1 or 1=1";
		Query q = session.createQuery("from User where userId <"+str);
		/*q.setFirstResult(5);
		q.setMaxResults(5);*/
		List<User> l = (List<User>)q.list();
		System.out.println(l.size());
		session.getTransaction().commit();
		session.close();
		
		

	}

}
