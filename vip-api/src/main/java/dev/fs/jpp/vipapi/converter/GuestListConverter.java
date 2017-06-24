package dev.fs.jpp.vipapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.fs.jpp.vipapi.entity.GuestList;
import dev.fs.jpp.vipapi.model.GuestListModel;

@Component("guestListConverter")
public class GuestListConverter implements IConverter<GuestList, GuestListModel> {

	@Override
	public GuestList modelToEntity(GuestListModel model) {
		return new GuestList(model.getId(), model.getRepresent(), model.getCreator(), model.getEvent(), model.getNumberOfGuests(), model.getGuestsNames(), model.getPresents());
	}

	@Override
	public List<GuestList> listModelToListEntity(List<GuestListModel> models) {
		List<GuestList> entities = new ArrayList<>();
		
		for (GuestListModel model : models) {
			entities.add(this.modelToEntity(model));
		}
		
		return entities;
	}

	@Override
	public GuestListModel entityToModel(GuestList entity) {
		return new GuestListModel(entity.getId(), entity.getRepresent(), entity.getCreator(), entity.getEvent(), entity.getNumberOfGuests(), entity.getGuestsNames(), entity.getPresents());
	}

	@Override
	public List<GuestListModel> listEntityToListModel(List<GuestList> entities) {
		List<GuestListModel> models = new ArrayList<>();
		
		for (GuestList entity : entities) {
			models.add(this.entityToModel(entity));
		}
		
		return models;
	}

}
