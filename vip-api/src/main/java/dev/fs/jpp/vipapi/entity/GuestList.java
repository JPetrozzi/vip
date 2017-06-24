package dev.fs.jpp.vipapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="guestList")
public class GuestList {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="represent", nullable=false)
	private String represent;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="iduser", referencedColumnName="id", nullable=false)
	private User creator;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idevent", referencedColumnName="id", nullable=false)
	private Event event;
	
	@Column(name="numberOfGuests")
	private int numberOfGuests;
	
	@Column(name="guestsNames")
	private String guestsNames;
	
	@Column(name="presents")
	private int presents;
	
	public GuestList() {
		super();
	}

	public GuestList(int id, String represent, User creator, Event event, int numberOfGuests, String guestsNames, int presents) {
		super();
		this.id = id;
		this.represent = represent;
		this.creator = creator;
		this.event = event;
		this.numberOfGuests = numberOfGuests;
		this.guestsNames = guestsNames;
		this.presents = presents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRepresent() {
		return represent;
	}

	public void setRepresent(String represent) {
		this.represent = represent;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public String getGuestsNames() {
		return guestsNames;
	}

	public void setGuestsNames(String guestsNames) {
		this.guestsNames = guestsNames;
	}

	public int getPresents() {
		return presents;
	}

	public void setPresents(int presents) {
		this.presents = presents;
	}

	@Override
	public String toString() {
		return "GuestList [id=" + id + ", represent=" + represent + ", creator=" + creator + ", event=" + event
				+ ", cantGuests=" + numberOfGuests + ", guestsNames=" + guestsNames + ", presents=" + presents + "]";
	}
}
