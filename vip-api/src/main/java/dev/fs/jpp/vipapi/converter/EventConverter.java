package dev.fs.jpp.vipapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.fs.jpp.vipapi.entity.Event;
import dev.fs.jpp.vipapi.model.EventModel;

@Component("eventConverter")
public class EventConverter implements IConverter<Event, EventModel>{

	@Override
	public Event modelToEntity(EventModel model) {
		return new Event(model.getId(), model.getName(), model.getDescription(), model.getDate(), model.getLists());
	}

	@Override
	public List<Event> listModelToListEntity(List<EventModel> models) {
		List<Event> entities = new ArrayList<>();
		
		for (EventModel model : models) {
			entities.add(this.modelToEntity(model));
		}
		
		return entities;
	}

	@Override
	public EventModel entityToModel(Event entity) {
		return new EventModel(entity.getId(), entity.getName(), entity.getDescription(), entity.getDate(), entity.getLists());
	}

	@Override
	public List<EventModel> listEntityToListModel(List<Event> entities) {
		
		List<EventModel> models = new ArrayList<>();
		
		for (Event entity : entities) {
			models.add(this.entityToModel(entity));
		}
		
		return models;
	}
}
