package de.tobias.ticketmonster.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * A show is an instance of an event taking place at a particular venue. A show
 * can have multiple performances.
 * </p>
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "event_id", "venue_id" }))
public class Show implements Serializable {

	/* Declaration of fields */

	/**
	 * The synthetic id of the object.
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	/**
	 * <p>
	 * The event of which this show is an instance. The
	 * <code>@ManyToOne<code> JPA mapping establishes this relationship.
	 * </p>
	 * 
	 * <p>
	 * The <code>@NotNull</code> Bean Validation constraint means that the event
	 * must be specified.
	 * </p>
	 */
	@ManyToOne
	@NotNull
	private Event event;

	/**
	 * <p>
	 * The event of which this show is an instance. The
	 * <code>@ManyToOne<code> JPA mapping establishes this relationship.
	 * </p>
	 * 
	 * <p>
	 * The <code>@NotNull</code> Bean Validation constraint means that the event
	 * must be specified.
	 * </p>
	 */
	@ManyToOne
	@NotNull
	private Venue venue;

	/* Boilerplate getters and setters */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	/**
	 * <p>
	 * The set of performances of this show.
	 * </p>
	 * 
	 * <p>
	 * The
	 * <code>@OneToMany<code> JPA mapping establishes this relationship. Collection members
	 * are fetched eagerly, so that they can be accessed even after the entity has become detached.
	 * This relationship is bi-directional (a performance knows which show it is part of), and the <code>mappedBy</code>
	 * attribute establishes this.
	 * </p>
	 * 
	 */
	@OneToMany(fetch = EAGER, mappedBy = "show", cascade = ALL)
	@OrderBy("date")
	private Set<Performance> performances = new HashSet<Performance>();

	public Set<Performance> getPerformances() {
		return performances;
	}

	public void setPerformances(Set<Performance> performances) {
		this.performances = performances;
	}

	/*
	 * toString(), equals() and hashCode() for Show, using the natural identity
	 * of the object
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Show show = (Show) o;

		if (event != null ? !event.equals(show.event) : show.event != null)
			return false;
		if (venue != null ? !venue.equals(show.venue) : show.venue != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = event != null ? event.hashCode() : 0;
		result = 31 * result + (venue != null ? venue.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return event + " at " + venue;
	}
}