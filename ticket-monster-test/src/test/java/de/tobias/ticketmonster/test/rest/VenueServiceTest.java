package de.tobias.ticketmonster.test.rest;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class VenueServiceTest {

	@Deployment
	public static WebArchive deployment() {
		// return RESTDeployment.deployment();
		return null;
	}
	//
	// @Inject
	// private VenueService venueService;
	//
	// @Test
	// public void testGetVenueById() {
	//
	// // Test loading a single venue
	// Venue venue = venueService.getSingleInstance(1l);
	// assertNotNull(venue);
	// assertEquals("Roy Thomson Hall", venue.getName());
	// }
	//
	// @Test
	// public void testPagination() {
	//
	// // Test pagination logic
	// MultivaluedMap<String, String> queryParameters = new
	// MockMultivaluedMap<String, String>();
	//
	// queryParameters.add("first", "2");
	// queryParameters.add("maxResults", "1");
	//
	// List<Venue> venues = venueService.getAll(queryParameters);
	// assertNotNull(venues);
	// assertEquals(1, venues.size());
	// assertEquals("BMO Field", venues.get(0).getName());
	// }

}
