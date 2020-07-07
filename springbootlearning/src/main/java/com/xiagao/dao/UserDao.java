package com.xiagao.dao;

import com.xiagao.model.pojo.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UserDao extends JpaRepository<User, Integer>, CrudRepository<User, Integer> {
    //通过username查询一条记录
//    @Query(value = "select * from t_user where username = ?1",nativeQuery = true)
    User findByUsername(String username);

    Optional<User> findById(Integer integer);
}
