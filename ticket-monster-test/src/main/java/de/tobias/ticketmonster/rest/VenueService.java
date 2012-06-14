package de.tobias.ticketmonster.rest;

import javax.inject.Singleton;
import javax.ws.rs.Path;

import de.tobias.ticketmonster.model.Venue;

/**
 * <p>
 * A JAX-RS endpoint for handling {@link Venue}s. Inherits the actual methods
 * from {@link BaseEntityService}.
 * </p>
 */
@Path("/venues")
/**
 * <p>
 *     This is a stateless service, so a single shared instance can be used in this case.
 * </p>
 */
@Singleton
public class VenueService extends BaseEntityService<Venue> {

	public VenueService() {
		super(Venue.class);
	}

}
