package com.afuo.learntools.pojo;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Date: 2021/2/6 12:14
 * @Author: afuo
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FourModifier {


    public String testPublic;
    protected String testProtected;
    String testDefault;
    private String testPrivate;

}
