package de.moneypal.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.ws.rs.Path;
import javax.ws.rs.core.MultivaluedMap;

import de.moneypal.model.ChartData;

@Path("/charts")
@Singleton
public class ChartService extends BaseEntityService<ChartData> {

	public ChartService() {
		super(ChartData.class);
	}

	@Override
	protected Predicate[] extractPredicates(MultivaluedMap<String, String> queryParameters, CriteriaBuilder criteriaBuilder, Root<ChartData> root) {
		List<Predicate> predicates = new ArrayList<Predicate>();

		if (queryParameters.containsKey("series")) {
			String series = queryParameters.getFirst("series");
			predicates.add(criteriaBuilder.equal(root.get("series").get("id"), series));
		}

		return predicates.toArray(new Predicate[] {});
	}
}
