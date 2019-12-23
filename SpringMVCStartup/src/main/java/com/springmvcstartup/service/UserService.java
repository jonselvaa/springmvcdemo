package com.springmvcstartup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvcstartup.Model.User;

public interface UserService {
	public boolean saveUser(User user);
	public List<User> getUsers();
}
