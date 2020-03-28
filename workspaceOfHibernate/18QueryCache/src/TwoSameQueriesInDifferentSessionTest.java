import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TwoSameQueriesInDifferentSessionTest {

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
		
		session.getTransaction().commit();
		
		session.close();
		
		session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Query query2 = session.createQuery("from User where userId=2006");
		query2.setCacheable(true);
		query2.list();
		
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
