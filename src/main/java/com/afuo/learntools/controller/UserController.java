package com.afuo.learntools.controller;


import com.afuo.learntools.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 返回list
     * @return
     */
    @RequestMapping("getUserList")
    public List<User> getUserList() {
        User user1  = new User();
        user1.setId(2);
        user1.setUsername("zhao_jia");
        user1.setPassword("123");
        User user2 = new User();
        user2.setId(3);
        user2.setUsername("zhao_yi");
        user2.setPassword("456");
        User user3 = new User();
        user3.setId(4);
        user3.setUsername("zhao_bin");
        user3.setPassword("789");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

    @RequestMapping("getUserMap")
    public Map<String,User> getUserMap(){
        User user1  = new User();
        user1.setId(2);
        user1.setUsername("zhao_jia");
        user1.setPassword("123");
        User user2 = new User();
        user2.setId(3);
        user2.setUsername("zhao_yi");
        user2.setPassword("456");
        User user3 = new User();
        user3.setId(4);
        user3.setUsername("zhao_bin");
        user3.setPassword("789");
        Map<String,User> map = new HashMap<>();
        map.put("user1",user1);
        map.put("user2",user2);
        map.put("user3",user3);
        return map;
    }

}
