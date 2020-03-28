package ngdemo.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import ngdemo.domain.User;
import ngdemo.service.UserService;


@Path("/")
public class UserRestService {

	@Path("/users")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDefaultUserInJSON() throws JSONException {
    	UserService userService = new UserService();
//    	JSONArray defaultUser = null;
//    	JSONArray listOfUsers = new JSONArray();
    	List<JSONObject> listOfUsers = new ArrayList<JSONObject>();
    	try {
    	
        
			 listOfUsers = userService.getUsersList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

//    	json.put(defaultUser);
    	/*List<User> l = new ArrayList<User>();
    	l.add(defaultUser);*/
//    	return listOfUsers.toArray(new User[]{});
    			//new JSONArray(l.toString());
    	return listOfUsers.toString();
    }
    
	@Path("/user/{personId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON(@PathParam("personId") int personId) throws JSONException {
    	UserService userService = new UserService();
    	User defaultUser = null;
    	try {
    	System.out.println("personId: "+personId);
        
			 defaultUser = userService.getUserDetails(personId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

    	return defaultUser;
    			//new JSONArray(l.toString());
    }
	
	@Path("/user/{personId}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject deleteUser(@PathParam("personId") int personId) throws JSONException {
    	UserService userService = new UserService();
    	Boolean isDeleted = false;
    	JSONObject result = new JSONObject();
    	try {
    	System.out.println("personId: "+personId);
        
			 isDeleted = userService.deleteUser(personId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

    	if(isDeleted){
    		result.put("result", "success");
    	} else {
    		result.put("result", "error");
    	}
    	return result;
    			//new JSONArray(l.toString());
    }
}
