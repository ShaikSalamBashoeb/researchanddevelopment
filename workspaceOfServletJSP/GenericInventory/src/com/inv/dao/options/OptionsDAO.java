package com.inv.dao.options;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.inv.vo.options.Option;

public class OptionsDAO {

	
	private DataSource ds;
	 
	public OptionsDAO(){
	  try {
		  
		  if(ds == null) {
			  
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/inventorydb");
		  }
	  } catch (NamingException e) {
		e.printStackTrace();
	  }
	}
 
	
	public List<Option> getOptions() {
		StringBuilder query = null;
		List<Option> optionsList = new ArrayList<Option>();
		Connection con = null;
		Statement stmt = null;
		try {
			
			System.out.println("getOptions");
//			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Loaded Driver Class");
			
			/*Connection con = DriverManager.getConnection("jdbc:odbc:inventorydb",
		              "", "");*/
			
			/*Connection con = DriverManager.getConnection("jdbc:mysql://hostname.com/inventorydb",
		              "", "");*/
			
			con = ds.getConnection();
			
			System.out.println("Got the connection");
			
			// Create and execute an SQL Statement
		     stmt = con.createStatement();
		     System.out.println("Got the statement");
		     
		     query = new StringBuilder("SELECT * FROM options");
		     
		     ResultSet rs = stmt.executeQuery(query.toString());
		     
		     System.out.println("Executed the query successfully");
		     
		     // Display the SQL Results
		     while(rs.next()) {
		       Option option = new Option();
		       option.setName(rs.getString("name"));
		       option.setUnitQuantity(rs.getDouble("unitquantity"));
		       option.setUnit(rs.getString("unit"));
		       option.setPricePerUnit(rs.getDouble("priceperunit"));
		       option.setTotalPrice(rs.getDouble("totalprice"));
		       option.setCreatedDate(rs.getTimestamp("createddate"));
		       
		       optionsList.add(option);
		       System.out.println(option);
		     }
		 
		     // Make sure our database resources are released
		     rs.close(  );
		     stmt.close(  );
		     con.close(  );
		     
		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (null != stmt)
					stmt.close();
				if (null != con)
					con.close();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		}
		
		return optionsList;
	}


	public Boolean createOption(Option option) {
		StringBuilder builder = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			
			builder = new StringBuilder("INSERT INTO options (name, unitquantity, unit, priceperunit, totalprice, createddate) VALUES (?,?,?,?,?,SYSDATE())");
			
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(builder.toString());
			
			pstmt.setString(1, option.getName());
			pstmt.setDouble(2, option.getUnitQuantity());
			pstmt.setString(3, option.getUnit());
			pstmt.setDouble(4, option.getPricePerUnit());
			pstmt.setDouble(5, option.getTotalPrice());
			
			pstmt.execute();
			
			pstmt.close();
			con.close();
			
			return Boolean.TRUE;
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				if (null != pstmt)
					pstmt.close();
				if (null != con)
					con.close();
			} catch (Exception e2) {
				e.printStackTrace();
			}
		}
		
		return Boolean.FALSE;
	}

}
