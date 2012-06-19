package de.tobias.patterns.service.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import de.tobias.patterns.slsb.PersonService;

@Stateless
@Remote(PersonService.class)
public class PersonServiceBean implements PersonService {

}
