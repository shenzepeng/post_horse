package com.example.post_horse.controller;

import com.example.post_horse.pojo.User;
import com.example.post_horse.service.UserService;
import com.example.post_horse.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019-02-21 15:50
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation("注册新用户")
    @PostMapping("/insertUser.action")
    public SzpJsonResult insertUser(@RequestBody User user){
        userService.insertUser(user);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过id删除User")
    @DeleteMapping("/deleteUserById.action")
    public SzpJsonResult deleteUserById(@RequestBody long id){

        userService.deleteUserById(id);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过id更新User信息，更新值不为null的字段")
    @PutMapping("/updateUserById.action")
    public SzpJsonResult updateUserById(@RequestBody User user){
        userService.updateUserById(user);
        return SzpJsonResult.ok();
    }
    //通过id查找user
    @ApiOperation("通过id查找user")
    @GetMapping("/findUserById.action")
    public SzpJsonResult findUserById(long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        User userById = userService.findUserById(id);
        return SzpJsonResult.ok(userById);
    }
    //通过username查找User判断改用户名是否被注册
    @ApiOperation("通过username查找User判断改用户名是否被注册")
    @GetMapping("/findUserByUsername.action")
    public SzpJsonResult findUserByUsername(String username, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> userByUsername = userService.findUserByUsername(username);
        return SzpJsonResult.ok(userByUsername);
    }
    //登录
    @ApiOperation("登录")
    @GetMapping("/findUserByUsernameAndPassword.action")
    public SzpJsonResult findUserByUsernameAndPassword(String username,String password, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<User> userByUsernameAndPassword = userService.findUserByUsernameAndPassword(username, password);
        if (userByUsernameAndPassword.size()!=0&&userByUsernameAndPassword!=null){
            User user = userByUsernameAndPassword.get(0);
            return SzpJsonResult.ok(user);
        }else {
            return SzpJsonResult.errorMsg("没有该用户");
        }
    }
}
