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
		int userId = 8;
		int hsNo = 5;
		int csNo = 6;
		User user = new User();
//		user.setUserId(userId);
		user.setUserName("Salam"+userId);
		
		Address compAdd = new Address();
//		compAdd.setSNo(csNo);
		compAdd.setCity("Punjagutta");
		compAdd.setStreet("Raj Bhavan");
		
		Address homeAdd = new Address();
//		homeAdd.setSNo(hsNo);
		homeAdd.setCity("Hyd");
		homeAdd.setStreet("Salala");
		
		user.getListOfAddress().add(homeAdd);
		user.getListOfAddress().add(compAdd);
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
