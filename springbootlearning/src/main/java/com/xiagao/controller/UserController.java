package com.xiagao.controller;


import com.xiagao.model.pojo.jpa.User;
import com.xiagao.model.pojo.mybatis.UserEntity;
import com.xiagao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @ResponseBody
//    @PostMapping(value = "/login.do")
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(@RequestBody String username) {
        System.out.println(username);
        return username;
    }


    @RequestMapping(value = "/findUserByUsername.do", method = RequestMethod.POST)
    public UserEntity findUserByUsername(String username){
        UserEntity userEntity = userService.selectByUsername(username);
        return userEntity;
    }
    @RequestMapping(value = "/findUserById.do", method = RequestMethod.POST)
    public User findUserById(Integer id){
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping(value = "/findAll.do", method = RequestMethod.GET)
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping(value = "/saveOne.do", method = RequestMethod.POST)
    public String saveOne(@RequestBody User user){
        boolean b = userService.saveOne(user);
        if (b){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

}
