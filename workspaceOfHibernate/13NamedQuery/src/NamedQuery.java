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
		Query q = session.getNamedQuery("User.byId");
		q.setInteger(0, 2006);
		List<User> l = (List<User>)q.list();
		System.out.println(l.size());
		session.getTransaction().commit();
		session.close();
		
		

	}

}
