package de.tobias.ticketmonster.test.rest;

import org.jboss.shrinkwrap.api.spec.WebArchive;

import de.moneypal.model.Booking;
import de.moneypal.rest.BaseEntityService;
import de.moneypal.service.MediaManager;
import de.moneypal.service.MediaPath;
import de.moneypal.service.SeatAllocationService;
import de.tobias.ticketmonster.test.TicketMonsterDeployment;
import de.tobias.ticketmonster.test.rest.util.MockMultivaluedMap;

public class RESTDeployment {

	public static WebArchive deployment() {
		return TicketMonsterDeployment.deployment().addPackage(Booking.class.getPackage()).addPackage(BaseEntityService.class.getPackage()).addPackage(MockMultivaluedMap.class.getPackage())
				.addClass(SeatAllocationService.class).addClass(MediaPath.class).addClass(MediaManager.class);
	}

}