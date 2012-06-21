package de.tobias.patterns.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import de.tobias.patterns.service.HelloWorld;

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
