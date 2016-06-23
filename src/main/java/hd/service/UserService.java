package hd.service;


import java.util.List;

import hd.model.User;

public interface UserService {
	public String getUserById(Integer id);
	
	public User findUserById(Integer id);
	
	List<User> getAll();
}
