package dev.fs.jpp.vipapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dev.fs.jpp.vipapi.converter.UserConverter;
import dev.fs.jpp.vipapi.entity.User;
import dev.fs.jpp.vipapi.model.UserModel;
import dev.fs.jpp.vipapi.repository.UserRepository;
import dev.fs.jpp.vipapi.service.UserService;

@Service("userServiceJpaImpl")
public class UserServiceJpaImpl implements UserService {
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository repository;
	
	@Autowired
	@Qualifier("userConverter")
	private UserConverter converter;

	@Override
	public UserModel add(UserModel userModel) {
		User user = repository.save(converter.modelToEntity(userModel));
		return converter.entityToModel(user);
	}

	@Override
	public UserModel update(UserModel userModel) {
		return add(userModel);
	}

	@Override
	public void remove(int id) {
		User user = repository.findOne(id);
		
		if (user != null) {
			repository.delete(user);
		}
	}

	@Override
	public List<UserModel> findAll() {
		return converter.listEntityToListModel(repository.findAll());
	}

	@Override
	public UserModel findById(int id) {
		return converter.entityToModel(repository.findOne(id));
	}

}
