package hd.dao;

import java.util.List;

import hd.model.User;

public interface UserMapper {
    int insert(User record);
    
    int insertSelective(User record);
    
    User selectByPrimaryKey(Integer id);
    
    List<User> getAll();
}