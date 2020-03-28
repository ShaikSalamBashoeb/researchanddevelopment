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
		c.add(Restrictions.eq("userName", "Salam554"));
		/*Collection<Integer> col = new ArrayList<Integer>();
		col.add(1);
		col.add(2);
		col.add(1007);
		c.add(Restrictions.in("userId", col));*/
//		c.add(Restrictions.gt("userId", 50));
		
		List<User> l = c.list();
		
		System.out.println(l.size());
		Iterator i1 = l.iterator();
		while (i1.hasNext()) {
			User u = (User) i1.next();
			System.out.println(u.getUserId());
			
		}
		
		session.close();
		
		

	}

}
