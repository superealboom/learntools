package com.afuo.learntools.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class User {

    private int id;
    private String username;
    private String password;
}
