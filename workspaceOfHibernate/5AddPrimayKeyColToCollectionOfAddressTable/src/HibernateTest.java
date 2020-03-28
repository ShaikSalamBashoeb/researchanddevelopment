import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.eoj.model.Address;
import com.eoj.model.User;


public class HibernateTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int userId = 7;
		User user = new User();
//		user.setUserId(userId);
		user.setUserName("Salam"+userId);
		
		Address homeAdd = new Address();
		homeAdd.setCity("Hyd");
		homeAdd.setStreet("Salala");
		
		
		Address companAdd = new Address();
		companAdd.setCity("Punjagutta");
		companAdd.setStreet("Raj bhavan");
		
		user.getListOfAddresses().add(homeAdd);
		user.getListOfAddresses().add(companAdd);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();

	}

}
