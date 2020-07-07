package com.xiagao.service;

import com.xiagao.model.pojo.jpa.User;
import com.xiagao.model.pojo.mybatis.UserEntity;

import java.util.List;

public interface UserService {
    public User findByUsername(String username);
    public UserEntity selectByUsername(String username);
    public User findById(Integer id);
    public List<User> findAll();
    public boolean saveOne(User user);

}
