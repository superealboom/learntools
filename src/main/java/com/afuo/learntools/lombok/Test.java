package com.afuo.learntools.lombok;

import com.afuo.learntools.pojo.Dog;
import com.afuo.learntools.pojo.Person;

/**
 * @Description: TODO
 * @Date: 2021/2/6 09:37
 * @Author: afuo
 */
public class Test {

    /*
     * @Author afuo
     * @Description //id取自animal父类。
     **/
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setId(1);
        dog1.setName("wangcai");

        Dog dog2 = new Dog();
        dog2.setId(1);
        dog2.setName("wangcai");

        Dog dog3 = new Dog();
        dog3.setId(2);
        dog3.setName("wangcai");

        Dog dog4 = new Dog();
        dog4.setId(1);
        dog4.setName("tiezhu");

        System.out.println("id,name都相同：" + dog1.equals(dog2));
        System.out.println("id不同，name相同：" + dog1.equals(dog3));
        System.out.println("id相同，name不同：" + dog1.equals(dog4));

        Person person1 = Person.builder().id(1).username("wanger").password("123456").build();

    }

}
