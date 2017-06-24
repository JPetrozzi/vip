package dev.fs.jpp.vipapi.model;

import dev.fs.jpp.vipapi.entity.Event;
import dev.fs.jpp.vipapi.entity.User;

public class GuestListModel {
	private int id;
	private String represent;
	private User creator;
	private Event event;
	private int numberOfGuests;
	private String guestsNames;
	private int presents;
	
	public GuestListModel() {
		super();
	}
	
	public GuestListModel(int id, String represent, User creator, Event event, int numberOfGuests, String guestsNames, int presents) {
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
		return "GuestListModel [id=" + id + ", represent=" + represent + ", creator=" + creator + ", event=" + event
				+ ", numberOfGuests=" + numberOfGuests + ", guestsNames=" + guestsNames + ", presents=" + presents
				+ "]";
	}
}
