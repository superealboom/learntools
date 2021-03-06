package com.afuo.learntools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("templates")
public class TemplatesController {

    /**
     * 测试freemarker
     * @param modelMap
     * @return
     */
    @RequestMapping("freemarker")
    public String testFreemarker(ModelMap modelMap) {
        modelMap.put("users", getUserForm());//测试freemarker返回表格
        modelMap.put("title", "测试freemarker");//测试freemarker返回字符串
        return "freemarker/test";
    }

    /**
     * 测试thymeleaf
     * @param modelMap
     * @return
     */
    @RequestMapping("thymeleaf")
    public String testThymeleaf(ModelMap modelMap) {
        modelMap.put("users", getUserForm());//测试freemarker返回表格
        modelMap.put("title", "测试thymeleaf");//测试freemarker返回字符串
        return "thymeleaf/test";
    }

    /**
     * 拿到用户列表
     * @return
     */
    private List<Map> getUserForm() {
        List<Map> userlist = new ArrayList<>();
        for (int i=0;i<10;i++) {
            Map map = new HashMap<>();
            map.put("id", i);
            map.put("username", "zhang_san_" + i);
            map.put("password", "xxxxxx" + i);
            userlist.add(map);
        }
        return userlist;
    }
}
