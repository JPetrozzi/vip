package dev.fs.jpp.vipapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.fs.jpp.vipapi.entity.User;
import dev.fs.jpp.vipapi.model.UserModel;

@Component("userConverter")
public class UserConverter implements IConverter<User, UserModel> {

	@Override
	public User modelToEntity(UserModel model) {
		return new User(model.getId(), model.getName(), model.getPhone(), model.getEmail(), model.getPassword(), model.getRoles());
	}

	@Override
	public List<User> listModelToListEntity(List<UserModel> models) {
		List<User> entities = new ArrayList<>();
		
		for (UserModel model : models) {
			entities.add(this.modelToEntity(model));
		}
		
		return entities;
	}

	@Override
	public UserModel entityToModel(User entity) {
		return new UserModel(entity.getId(), entity.getName(), entity.getPhone(), entity.getEmail(), entity.getPassword(), entity.getRoles());
	}

	@Override
	public List<UserModel> listEntityToListModel(List<User> entities) {
		List<UserModel> models = new ArrayList<>();
		
		for (User entity : entities) {
			models.add(this.entityToModel(entity));
		}
		
		return models;
	}

}
