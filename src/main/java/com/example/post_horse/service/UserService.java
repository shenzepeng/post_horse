package com.example.post_horse.service;

import com.example.post_horse.pojo.User;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 17:18
 * @Description: 沈泽鹏写点注释吧
 */
public interface UserService {
    void insertUser(User user);
    void deleteUserById(long id);
    void updateUserById(User user);
    //通过id查找user
    User findUserById(long id);
    //通过username查找User判断改用户名是否被注册
    List<User> findUserByUsername(String username);
    //登录
    List<User> findUserByUsernameAndPassword(String username,String password);

}
