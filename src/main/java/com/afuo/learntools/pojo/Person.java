package com.afuo.learntools.pojo;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private int id;
    private String username;
    private String password;

    public void eat() {
        System.out.println("eat!!!");
    }

    public void eat(String food) {
        System.out.println("eat!!!" + food);
    }

    public void drink() {
        System.out.println("drink!!!");
    }
}
