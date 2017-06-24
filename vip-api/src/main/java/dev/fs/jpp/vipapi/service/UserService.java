package dev.fs.jpp.vipapi.service;

import java.util.List;

import dev.fs.jpp.vipapi.model.UserModel;

public interface UserService {
	public abstract UserModel add(UserModel userModel);
	public abstract UserModel update(UserModel userModel);
	public abstract void remove(int id);
	public abstract List<UserModel> findAll();
	public abstract UserModel findById(int id);
}
