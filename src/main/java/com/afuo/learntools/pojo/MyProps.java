package com.afuo.learntools.pojo;

import com.sun.xml.internal.bind.v2.TODO;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: TODO
 * @Date: 2021/2/6 14:29
 * @Author: afuo
 */

@Data
@Component
@ConfigurationProperties(prefix = "myprops")//不能有大写
public class MyProps {

    private String className;
    private String methodName;

    private String[] animals;
    private List<String> userIdList = new ArrayList<>();
    private Map<String, String> userMap = new HashMap<>();
    private List<Map<String, String>> userList = new ArrayList<>();

//    public static void main(String[] args) {
//
//    }
}
