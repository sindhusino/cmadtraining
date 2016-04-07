package com.mydomain.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/user")
public class UserService {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Users> getUsers(){
		Users u = new Users();
		List<Users> users = new ArrayList<Users>();
		users.add(u);
		return users;
	}
}
