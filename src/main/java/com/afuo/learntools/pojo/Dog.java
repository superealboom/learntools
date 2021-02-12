package com.afuo.learntools.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Description: TODO
 * @Date: 2021/2/6 09:36
 * @Author: afuo
 */

@Data
@EqualsAndHashCode(callSuper=true)
public class Dog extends Animal{

    private String name;

}
