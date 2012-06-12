package de.tobias.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Validator;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import de.tobias.common.JsonResponse;
import de.tobias.model.User;

@Path("/user")
public class UserService {
	private static Validator validator;
	private List<User> userList = new ArrayList<User>();

	@GET
	@Path("/AddUser.do")
	public String showForm() {
		return "AddUser";
	}

	@POST
	@Path("/AddUser.do")
	@Produces("text/xml")
	public String addUser(@FormParam("user") User user, @Context HttpServletResponse servletResponse) {
		JsonResponse res = new JsonResponse();
		if (user != null) {
			userList.add(user);
			res.setStatus("SUCCESS");
			res.setResult(userList);
		} else {
			res.setStatus("FAIL");
			// res.setResult(.getAllErrors());
		}

		return res.toString();
	}
}