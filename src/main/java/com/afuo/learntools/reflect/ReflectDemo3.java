package com.afuo.learntools.reflect;

import com.afuo.learntools.pojo.Person;

import java.lang.reflect.Constructor;

/**
 * @Description: TODO
 * @Date: 2021/2/6 13:04
 * @Author: afuo
 */
public class ReflectDemo3 {

    public static void main(String[] args) throws Exception {
        //0. 获取FourModifier的Class对象
        Class userClass = Person.class;

        //1. 获取无参构造方法
        Constructor noConstructor = userClass.getConstructor();
        System.out.println("无参：" + noConstructor);
        //1.1 无参构造方法创建对象
        Object noObject1 = noConstructor.newInstance();
        System.out.println("无参构造方法创建对象：" + noObject1);
        //1.2 用类创建对象
        Object noObject2 = userClass.newInstance();
        System.out.println("用类创建对象：" + noObject2);

        //2.获取有参构造方法（这里以全参为例）
        Constructor allConstructor = userClass.getConstructor(int.class,String.class,String.class);
        System.out.println("有参：" + allConstructor);
        //2.1 有参构造方法创建对象
        Object allObject1 = allConstructor.newInstance(1001,"张三", "123456");
        System.out.println("有参构造方法创建对象：" + allObject1);

        //3. getDeclaredConstructor()（加上Declared 不考虑修饰符）
        //3.1 例如 privateConstructor.setAccessible(true);暴力反射
    }
}