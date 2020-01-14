package com.example.demo.controller;

import com.example.demo.beans.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author An_J1ng
 * @Date 2020/1/14 -6:48
 */
@RestController
public class UserController {
    @RequestMapping("/get/{id}")
    public User t1(@PathVariable("id")Integer id){
        User user = new User();
        user.setId(id);
        System.out.println(user+"this is local dev");
        return user;
    }
    public void t2(){
        //服务器更新
    }
}
