package com.zy.controller;

import com.zy.entity.User;
import com.zy.service.UserService;
import com.zy.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public RespBean findById(@PathVariable Integer id){
        User u = userService.findById(id);
        return RespBean.success("查询成功",u);
    }

    @GetMapping(value = "/")
    public RespBean loginUser(@RequestParam(value = "name") String name,
                              @RequestParam(value = "pwd") String pwd){
        User u = userService.loginUser(name,pwd);
        if (u != null){
            return RespBean.success("登录成功",u);
        }else{
            return RespBean.error("登录失败");
        }
    }

    @PostMapping(value = "/")
    public RespBean registerUser(@RequestParam(value = "loginName") String loginName,
                                 @RequestParam(value = "userName") String userName,
                                 @RequestParam(value = "password") String password,
                                 @RequestParam(value = "sex") int sex,
                                 @RequestParam(value = "email") String email,
                                 @RequestParam(value = "mobile") String mobile,
                                 @RequestParam(value = "identityCode") String identityCode){
        User u = new User();
        u.setLoginname(loginName);
        u.setUsername(userName);
        u.setPassword(password);
        u.setSex(sex);
        u.setEmail(email);
        u.setMobile(mobile);
        u.setIdentitycode(identityCode);
        int res = userService.registerUser(u);
        if (res >= 1){
            return RespBean.success("注册成功",u);
        }else {
            return RespBean.error("注册失败");
        }
    }

}
