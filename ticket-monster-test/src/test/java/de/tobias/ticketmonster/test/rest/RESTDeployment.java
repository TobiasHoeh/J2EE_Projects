package de.tobias.ticketmonster.test.rest;

import org.jboss.shrinkwrap.api.spec.WebArchive;

public class RESTDeployment {

	public static WebArchive deployment() {
		// return
		// TicketMonsterDeployment.deployment().addPackage(Booking.class.getPackage()).addPackage(BaseEntityService.class.getPackage()).addPackage(MockMultivaluedMap.class.getPackage())
		// .addClass(SeatAllocationService.class).addClass(MediaPath.class).addClass(MediaManager.class);
		return null;
	}

}