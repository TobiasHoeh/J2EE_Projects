package de.tobias.pattern.proxy;

public class Client {
	public static void main(String[] args) {
		Proxy p = BusinessComponentFactory.getBusinessComponent();
		p.doSomething();
	}
}
