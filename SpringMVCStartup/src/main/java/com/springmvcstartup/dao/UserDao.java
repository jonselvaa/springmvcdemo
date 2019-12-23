package com.springmvcstartup.dao;

import com.springmvcstartup.Model.User;

import java.util.List;

public interface UserDao {
	public boolean saveUser(User user);
	public List<User> getUsers();
}
