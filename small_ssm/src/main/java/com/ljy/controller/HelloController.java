package com.ljy.controller;

import com.ljy.model.User;
import com.ljy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String index(){
        return "hello";
    }

    @GetMapping("/")
    @ResponseBody
    public Person get(String name){
        Person p = new Person(name);
        return p;
    }

    @GetMapping("/getData")
    @ResponseBody
    public List<User> getData(){
        return userService.getAll();
    }



    @GetMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(int id){
        return userService.getOneUserInfo(id);
    }

    @GetMapping("/getUserForName")
    @ResponseBody
    public List<User> getUserForName(String name){
        return userService.getUserForName(name);
    }
}
