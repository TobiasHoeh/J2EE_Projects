package de.tobias.pattern.proxy;

public class LoggingProxy implements Proxy {

	public Proxy next;

	public LoggingProxy(Proxy next) {
		this.next = next;
	}

	public void doSomething() {
		System.out.println(this.getClass().getName() + "entered");

		this.next.doSomething();

		System.out.println(this.getClass().getName() + "left");
	}

}
