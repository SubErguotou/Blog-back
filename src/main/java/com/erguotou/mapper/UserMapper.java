package com.erguotou.mapper;

import com.erguotou.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     */
    List<User> getAllUser();

    /**
     * 删除指定用户
     */
    void deleteUser(int id);
    /**
     * 修改用户
     */
    void updateUser(User user);
    /**
     * 增加用户
     */
    void addUser(User user);
//    查询用户写过的博客

}
