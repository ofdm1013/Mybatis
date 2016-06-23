package hd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hd.dao.UserMapper;
import hd.model.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	public UserMapper userMapper;
	public UserMapper getUserMapper() {
		return userMapper;
	}
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	public String getUserById(Integer id) {
		// TODO Auto-generated method stub
		return "sss";
	}
	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userMapper.getAll();
	}

}
