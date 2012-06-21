package de.tobias.patterns.service;

import javax.ejb.Remote;

@Remote
public interface HelloWorld {

	public String HelloWorld();
}
