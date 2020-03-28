package com.spring;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JdbcDaoImpl {
	
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate = null; 
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate = null;

	public Circle getCircle() {
		Circle c = null;
		String sql = "select name from person where person_id = ?";
		c = jdbcTemplate.queryForObject(sql, new Object[] { 1 },
				new CircleMapper());

		return c;

	}
	
	public List<Circle> getCircleList() {
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
	}

	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
