package de.tobias.patterns.slsb;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
	public static void main(String[] args) {

		try {
			InitialContext ctx = new InitialContext();
			HelloWorld hw = (HelloWorld) ctx.lookup("HelloWorldBean/remote");
			System.out.println(hw.HelloWorld());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
