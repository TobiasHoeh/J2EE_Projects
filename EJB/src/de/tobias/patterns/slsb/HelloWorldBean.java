package de.tobias.patterns.slsb;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

@Stateless
@Remote(HelloWorld.class)
@WebService
public class HelloWorldBean implements HelloWorld {

	@Override
	@WebMethod
	public String HelloWorld() {
		// TODO Auto-generated method stub
		return "HelloWorld";
	}
}
