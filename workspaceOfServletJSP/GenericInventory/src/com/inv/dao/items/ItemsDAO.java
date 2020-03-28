package com.inv.dao.items;

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

import com.inv.vo.items.Item;
import com.inv.vo.options.Option;

public class ItemsDAO {

	
	private DataSource ds;
	 
	public ItemsDAO(){
	  try {
		  
		  if(ds == null) {
			  
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/inventorydb");
		  }
	  } catch (NamingException e) {
		e.printStackTrace();
	  }
	}
 
	
	public List<Item> getInventory() {
		StringBuilder query = null;
		List<Item> itemsList = new ArrayList<Item>();
		try {
			
			System.out.println("getInventory");
//			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("Loaded Driver Class");
			
			/*Connection con = DriverManager.getConnection("jdbc:odbc:inventorydb",
		              "", "");*/
			
			/*Connection con = DriverManager.getConnection("jdbc:mysql://hostname.com/inventorydb",
		              "", "");*/
			
			Connection con = ds.getConnection();
			
			System.out.println("Got the connection");
			
			// Create and execute an SQL Statement
		     Statement stmt = con.createStatement();
		     System.out.println("Got the statement");
		     
		     query = new StringBuilder("SELECT * FROM items");
		     
		     ResultSet rs = stmt.executeQuery(query.toString());
		     
		     System.out.println("Executed the query successfully");
		     
		     // Display the SQL Results
		     while(rs.next()) {
		       Item item = new Item();
		       item.setName(rs.getString("name"));
		       item.setUnit(rs.getString("unit"));
		       item.setUnitQuantity(rs.getDouble("unitquantity"));
		       item.setPricePerUnit(rs.getDouble("priceperunit"));
		       item.setTotalPrice(rs.getDouble("totalprice"));
		       item.setCreatedDate(rs.getTimestamp("createdDate"));
		       itemsList.add(item);
		       System.out.println(item);
		     }
		 
		     // Make sure our database resources are released
		     rs.close(  );
		     stmt.close(  );
		     con.close(  );
		     
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return itemsList;
	}


	public Boolean createInventory(Item item) {
		StringBuilder builder = null;
		try {
			
			builder = new StringBuilder("INSERT INTO items (name, unit, unitquantity, priceperunit, totalprice, createdDate) VALUES (?,?,?,?,?,SYSDATE())");
			
			Connection con = ds.getConnection();
			
			PreparedStatement pstmt = con.prepareStatement(builder.toString());
			
			pstmt.setString(1, item.getName());
			pstmt.setString(2, item.getUnit());
			pstmt.setDouble(3, item.getUnitQuantity());
			pstmt.setDouble(4, item.getPricePerUnit());
			pstmt.setDouble(5, item.getTotalPrice());
			
			pstmt.execute();
			
			pstmt.close();
			con.close();
			
			return Boolean.TRUE;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Boolean.FALSE;
	}

}
