import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
		
		Criteria c = session.createCriteria(User.class);
		/**
		 * it fetches only userId instead of complete User object
		 */
		c.setProjection(Projections.property("userId"));
		c.add(Restrictions.eq("userName", "Salam554"));
//		c.addOrder(Order.desc("userId"));
		
		List<Integer> l = c.list();
		
		System.out.println(l.size());
		Iterator i1 = l.iterator();
		while (i1.hasNext()) {
			Integer i = (Integer) i1.next();
			System.out.println(i);
			
		}
		
		session.close();
		
		

	}

}
