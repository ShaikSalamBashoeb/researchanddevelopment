package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CircleMapper implements RowMapper<Circle> {

	public Circle mapRow(ResultSet rs, int rowNumber) throws SQLException {
		
		Circle c = new Circle();
//		c.setPerson_id(rs.getInt("person_id"));
		c.setName(rs.getString("name"));
		return c;
	}

}
