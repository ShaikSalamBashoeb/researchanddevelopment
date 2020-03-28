package ngdemo.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

import ngdemo.domain.User;
import ngdemo.domain.UserTest;

public class UserService {

	public static User getUserDetails(int personId) throws SQLException {
		User user = new User();
		/*user.setFirstName("JonFromREST3345");
		user.setLastName("DoeFromREST11");
*/
		Connection con = null;
		try {
			con = getConnection();
			// here sonoo is database name, root is username and password
			PreparedStatement stmt = con.prepareStatement("select name, contactNumber from person"
					+ " where person_id = ?");
			stmt.setInt(1, personId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				user.setPersonId(personId);
				user.setName(rs.getString(1));
				user.setContactNumber(rs.getString(2));
				System.out.println(user.getName() + "  " + user.getContactNumber());
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}

		return user;
	}

	private static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/contacts_db", "root", "tiger");
		return con;
	}
	
	public static void main(String[] args) {
		UserService us = new UserService();
		try {
			User defaultUser = UserService.getUserDetails(1);
			ObjectMapper objMap = new ObjectMapper();
			UserTest u = new UserTest();
			u.setError("error in eTime");
			List<User> list = new ArrayList<User>();
			list.add(defaultUser);
			u.setList(list);
			String jsonString = objMap.writeValueAsString(u);
//			String jsonString = "{\"name\":\"Salam\",\"contactNumber\":\"9908724036\"}";
			System.out.println(jsonString);
			
			//convert json to obj
			UserTest user = objMap.readValue(jsonString, UserTest.class);
			System.out.println(user.getList().get(0).getName());
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*public JSONArray getUsersList() throws SQLException {

		User user = null;
		Connection con = null;
		JSONArray jsonArray = new JSONArray();
		try {
			con = getConnection();
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from person");
			JSONObject userJson = null;//new JSONObject();
			while (rs.next()) {
				user = new User();
				userJson = new JSONObject();
				user.setName(rs.getString(1));
				user.setContactNumber(rs.getString(2));
				System.out.println(user.getName() + "  " + user.getContactNumber());
				userJson.append("name", user.getName());
				userJson.append("contactNumber", user.getContactNumber());
				jsonArray.put(userJson);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}

		return jsonArray;
	
	}
*/
	
	public List<JSONObject> getUsersList() throws SQLException {

		User user = null;
		Connection con = null;
		List<JSONObject> list = new ArrayList<JSONObject>();
		try {
			con = getConnection();
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select person_id, name, contactNumber from person");
			JSONObject userJson = null;//new JSONObject();
			while (rs.next()) {
				user = new User();
				userJson = new JSONObject();
				user.setPersonId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setContactNumber(rs.getString(3));
				System.out.println(user.getPersonId() +" "+ user.getName() + "  " + user.getContactNumber());
				userJson.put("personId", user.getPersonId());
				userJson.put("name", user.getName());
				userJson.put("contactNumber", user.getContactNumber());
				list.add(userJson);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}

		return list;
	
	}

	public Boolean deleteUser(int personId) throws SQLException {
		User user = new User();
		/*user.setFirstName("JonFromREST3345");
		user.setLastName("DoeFromREST11");
*/
		Connection con = null;
		boolean isDeleted = false;
		try {
			con = getConnection();
			// here sonoo is database name, root is username and password
			PreparedStatement stmt = con.prepareStatement("delete from person"
					+ " where person_id = ?");
			stmt.setInt(1, personId);
			int count = stmt.executeUpdate();
			if (count >=1) {
				isDeleted = true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}

		return isDeleted;
	}
}
