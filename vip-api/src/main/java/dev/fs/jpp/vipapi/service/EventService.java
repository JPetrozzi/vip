package dev.fs.jpp.vipapi.service;

import java.util.List;

import dev.fs.jpp.vipapi.model.EventModel;

public interface EventService {
	public abstract EventModel add(EventModel eventModel);
	public abstract EventModel update(EventModel eventModel);
	public abstract void remove(int id);
	public abstract List<EventModel> findAll();
	public abstract EventModel findById(int id);
}
