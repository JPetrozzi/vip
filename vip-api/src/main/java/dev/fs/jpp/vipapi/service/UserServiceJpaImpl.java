package dev.fs.jpp.vipapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dev.fs.jpp.vipapi.converter.UserConverter;
import dev.fs.jpp.vipapi.model.UserModel;
import dev.fs.jpp.vipapi.repository.UserRepository;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel update(UserModel userModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
