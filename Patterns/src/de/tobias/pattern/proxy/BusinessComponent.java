package de.tobias.pattern.proxy;


public class BusinessComponent implements Proxy {

	public void doSomething() {
		System.out.println(this.getClass().getName() + "entered");

		System.out.println(this.getClass().getName() + "left");
	}
}
