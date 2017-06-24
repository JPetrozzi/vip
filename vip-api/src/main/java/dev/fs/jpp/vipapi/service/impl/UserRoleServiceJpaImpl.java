package dev.fs.jpp.vipapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dev.fs.jpp.vipapi.converter.UserRoleConverter;
import dev.fs.jpp.vipapi.entity.User;
import dev.fs.jpp.vipapi.entity.UserRole;
import dev.fs.jpp.vipapi.model.UserRoleModel;
import dev.fs.jpp.vipapi.repository.UserRoleRepository;
import dev.fs.jpp.vipapi.service.UserRoleService;

@Service("userRoleServiceJpaImpl")
public class UserRoleServiceJpaImpl implements UserRoleService {

	@Autowired
	@Qualifier("userRoleRepository")
	private UserRoleRepository repository;
	
	@Autowired
	@Qualifier("userRoleConverter")
	private UserRoleConverter converter;
	
	@Override
	public UserRoleModel add(UserRoleModel model) {
		UserRole userRole = repository.save(converter.modelToEntity(model));
		return converter.entityToModel(userRole);
	}

	@Override
	public UserRoleModel update(UserRoleModel model) {
		return add(model);
	}

	@Override
	public void remove(int id) {
		UserRole userRole = repository.findOne(id);
		
		if (userRole != null) {
			repository.delete(userRole);
		}
	}

	@Override
	public List<UserRoleModel> findAll() {
		return converter.listEntityToListModel(repository.findAll());
	}

	@Override
	public UserRoleModel findById(int id) {
		return converter.entityToModel(repository.findOne(id));
	}

}
