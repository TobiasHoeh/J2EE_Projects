package de.tobias.patterns.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import de.tobias.patterns.service.HelloWorld;
import de.tobias.patterns.service.PersonService;

public class Client {
	public static void main(String[] args) {

		try {
			InitialContext ctx = new InitialContext();
			HelloWorld hw = (HelloWorld) ctx.lookup("HelloWorldBean/remote-de.tobias.patterns.service.HelloWorld");
			System.out.println(hw.HelloWorld());

			PersonService ps = (PersonService) ctx.lookup("PersonServiceBean/remote-de.tobias.patterns.service.PersonService");
			ps.createPerson("Tobias", "Hoehmann");
			System.out.println(ps.getPerson(1).getVorname());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
