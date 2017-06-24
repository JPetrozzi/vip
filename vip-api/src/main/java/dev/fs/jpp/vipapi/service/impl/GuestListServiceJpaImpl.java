package dev.fs.jpp.vipapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dev.fs.jpp.vipapi.converter.GuestListConverter;
import dev.fs.jpp.vipapi.entity.GuestList;
import dev.fs.jpp.vipapi.entity.UserRole;
import dev.fs.jpp.vipapi.model.GuestListModel;
import dev.fs.jpp.vipapi.repository.GuestListRepository;
import dev.fs.jpp.vipapi.service.GuestListService;

@Service("guestListServiceJpaImpl")
public class GuestListServiceJpaImpl implements GuestListService {

	@Autowired
	@Qualifier("guestListRepository")
	private GuestListRepository repository;
	
	@Autowired
	@Qualifier("guestListConverter")
	private GuestListConverter converter;
	
	@Override
	public GuestListModel add(GuestListModel model) {
		GuestList guestList = repository.save(converter.modelToEntity(model));
		return converter.entityToModel(guestList);
	}

	@Override
	public GuestListModel update(GuestListModel model) {
		return add(model);
	}

	@Override
	public void remove(int id) {
		GuestList guestList = repository.findOne(id);
		
		if (guestList != null) {
			repository.delete(guestList);
		}
	}

	@Override
	public List<GuestListModel> findAll() {
		return converter.listEntityToListModel(repository.findAll());
	}

	@Override
	public GuestListModel findById(int id) {
		return converter.entityToModel(repository.findOne(id));
	}

}
