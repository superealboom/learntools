package com.afuo.learntools.controller;


import com.afuo.learntools.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private User user;

    /**
     * 测试对象
     * @return
     */
    @RequestMapping("getUser")
    public User User() {
        user = new User();
        user.setId(1);
        user.setUsername("zhang_san");
        user.setPassword("123456");
        return  user;
    }

}
