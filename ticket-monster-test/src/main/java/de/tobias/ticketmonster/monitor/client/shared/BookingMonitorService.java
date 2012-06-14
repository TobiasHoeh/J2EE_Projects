package de.tobias.ticketmonster.monitor.client.shared;

import java.util.List;
import java.util.Map;

import javax.ejb.Remote;

import de.tobias.ticketmonster.model.Show;

/**
 * A service used by the booking monitor for retrieving status information.
 * 
 * Errai's @Remote annotation indicates that the Service implementation can be
 * used as an RPC endpoint and that this interface can be used on the client for
 * type safe method invocation on this endpoint.
 */
@Remote
public interface BookingMonitorService {

	/**
	 * Lists all active {@link Show}s (shows with future performances).
	 * 
	 * @return list of shows found.
	 */
	public List<Show> retrieveShows();

	/**
	 * Constructs a map of performance IDs to the total number of sold tickets.
	 * 
	 * @return map of performance IDs to the total number of sold tickets.
	 */
	public Map<Long, Long> retrieveOccupiedCounts();
}