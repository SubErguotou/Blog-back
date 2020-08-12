package com.erguotou.controller;

import com.erguotou.mapper.UserMapper;
import com.erguotou.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class UserController {
     @Autowired
     private UserMapper userMapper;
     @Autowired
     private User user;


//    查询所有用户
    @RequestMapping("/getalluser")
    public List<User> getAllUser(){
        for (User user:
             userMapper.getAllUser()) {
            System.out.println(user);
        }
        return userMapper.getAllUser();
    }
//    添加一个用户
    @RequestMapping("/adduser")
    public long adduser(){
        user.setUserName("御坂美琴")
                .setUserPasswd("1339218991fks")
                .setUserEmail("1339218991@fks")
                .setBlogNumber(1)
                .setCreatTime(LocalDateTime.now())
                .setUpdateTime(LocalDateTime.now());
        userMapper.addUser(user);
        System.out.println(user.getId());

        return user.getId();
    }

//    删除一个用户
    @RequestMapping("/deleteuser")
    public int deleteUser(int id){
        System.out.println(id);
        userMapper.deleteUser(id);
        return id;
    }


//    修改一个用户
    @RequestMapping("/updateuser")
    public User updateuser(){

        return user;
    }

//    @RequestMapping("/deleteuser")
//    public String deleteUser(int id){
//        userMapper.deleteUser(id);
//        return "删除成功";
//    }


}
