package dev.fs.jpp.vipapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.fs.jpp.vipapi.entity.UserRole;
import dev.fs.jpp.vipapi.model.UserRoleModel;

@Component("userRoleConverter")
public class UserRoleConverter implements IConverter<UserRole, UserRoleModel> {

	@Override
	public UserRole modelToEntity(UserRoleModel model) {
		return new UserRole(model.getId(), model.getUser(), model.getRole());
	}

	@Override
	public List<UserRole> listModelToListEntity(List<UserRoleModel> models) {
		List<UserRole> entities = new ArrayList<>();
		
		for (UserRoleModel model : models) {
			entities.add(this.modelToEntity(model));
		}
		
		return entities;
	}

	@Override
	public UserRoleModel entityToModel(UserRole entity) {
		return new UserRoleModel(entity.getId(), entity.getUser(), entity.getRole());
	}

	@Override
	public List<UserRoleModel> listEntityToListModel(List<UserRole> entities) {
		List<UserRoleModel> models = new ArrayList<>();
		
		for (UserRole entity : entities) {
			models.add(this.entityToModel(entity));
		}
		
		return models;
	}

}
