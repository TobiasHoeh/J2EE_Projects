package de.tobias.pattern.proxy;

public class BusinessComponentFactory {
	public static Proxy getBusinessComponent() {
		return new SecurityProxy(new LoggingProxy(new BusinessComponent()));
	}
}
