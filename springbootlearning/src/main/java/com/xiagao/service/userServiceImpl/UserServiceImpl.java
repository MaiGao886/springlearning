package com.xiagao.service.userServiceImpl;

import com.xiagao.dao.UserDao;
import com.xiagao.mapper.UserEntityMapper;
import com.xiagao.model.pojo.jpa.User;
import com.xiagao.model.pojo.mybatis.UserEntity;
import com.xiagao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userRepository;
    @Resource
    private UserEntityMapper userEntityMapper;
//    @Resource
//    private ElasticsearchRestTemplate elasticsearchRestTemplate;


    @Override
    public User findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user;
    }

    @Override
    public UserEntity selectByUsername(String username) {
        UserEntity userEntity = userEntityMapper.selectByUsername(username);
        return userEntity;
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).get();
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }


    @Override
    public boolean saveOne(User user) {
        User user1 = userRepository.save(user);
        if (user1 != null) {
            return true;
        } else {
            return false;
        }
    }


}
