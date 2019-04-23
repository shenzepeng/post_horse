package com.example.post_horse.service;

import com.example.post_horse.mapper.UserMapper;
import com.example.post_horse.pojo.User;
import com.example.post_horse.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-20 19:07
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void deleteUserById(long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findUserById(long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public List<User> findUserByUsername(String username) {
        UserExample userExample=new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }

    @Override
    public List<User> findUserByUsernameAndPassword(String username, String password) {
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }
}
