package de.moneypal.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import de.moneypal.model.Show;
import de.moneypal.monitor.client.shared.BookingMonitorService;

/**
 * Implementation of {@link BookingMonitorService}.
 * 
 * Errai's @Service annotation exposes this service as an RPC endpoint.
 */
@ApplicationScoped
@SuppressWarnings("unchecked")
public class BookingMonitorServiceImpl implements BookingMonitorService {

	@Inject
	private EntityManager entityManager;

	@Override
	public List<Show> retrieveShows() {
		Query showQuery = entityManager.createQuery("select DISTINCT s from Show s JOIN s.performances p " + "WHERE p.date > current_timestamp");
		return showQuery.getResultList();
	}

	@Override
	public Map<Long, Long> retrieveOccupiedCounts() {
		Map<Long, Long> occupiedCounts = new HashMap<Long, Long>();

		Query occupiedCountsQuery = entityManager.createQuery("select s.performance.id, SUM(s.occupiedCount) from SectionAllocation s "
				+ "where s.performance.date > current_timestamp GROUP BY s.performance.id");

		List<Object[]> results = occupiedCountsQuery.getResultList();
		for (Object[] result : results) {
			occupiedCounts.put((Long) result[0], (Long) result[1]);
		}

		return occupiedCounts;
	}
}
