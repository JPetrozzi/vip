package dev.fs.jpp.vipapi.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import dev.fs.jpp.vipapi.entity.User;
import dev.fs.jpp.vipapi.model.UserModel;

@Component("userConverter")
public class UserConverter implements IConverter<User, UserModel> {

	@Override
	public User modelToEntity(UserModel model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listModelToListEntity(List<UserModel> models) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel entityToModel(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserModel> listEntityToListModel(List<User> entities) {
		// TODO Auto-generated method stub
		return null;
	}

}
