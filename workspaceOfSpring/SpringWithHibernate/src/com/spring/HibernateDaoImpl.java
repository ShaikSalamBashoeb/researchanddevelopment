package com.spring;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDaoImpl {
	
//	HibernateTemplate template;  

	private SessionFactory sessionFactory;
	/*@Autowired
	private DataSource dataSource;*/
	/*private JdbcTemplate jdbcTemplate = null; 
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate = null;*/

	public Long getCircleSize() {
		String hql = "select count(*) from Person";
		Query q = sessionFactory.openSession().createQuery(hql);
		return (Long) q.uniqueResult();
	}
	
	/*public List<Circle> getCircleList() {
		List<Circle> list = null;
			String sql = "select name from person";
			list =  jdbcTemplate.query(sql, new CircleMapper());
			
		return list;
		
	}
	
	public void insertCircle(Circle c) {
		String sql = "insert into person (person_id, name) values (?, ?)";
		int count = jdbcTemplate.update(sql, new Object[] { c.getId(),
				c.getName() });
		System.out.println("Update Count is: " + count);
	}
	
	public void insertCircleWithNamedPrameter(Circle c) {
		String sql = "insert into person (person_id, name) values (:id, :name)";
		SqlParameterSource namedPar = new MapSqlParameterSource("id", c.getId())
										.addValue("name", c.getName());
		int count = namedParameterJdbcTemplate.update(sql, namedPar);
		System.out.println("Update Count is: " + count);
	}*/

	/*public void setDataSource(DataSource dataSource) {
//		jdbcTemplate = new JdbcTemplate(dataSource);
//		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}*/

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}*/
}
