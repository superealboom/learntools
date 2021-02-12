package com.afuo.learntools.reflect;

import com.afuo.learntools.pojo.Person;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Date: 2021/2/6 13:56
 * @Author: afuo
 */
public class ReflectDemo4 {

    public static void main(String[] args) throws Exception {
        //0. 获取FourModifier的Class对象
        Class userClass = Person.class;

        //1. 获取该类所有public方法
        // getDeclaredMethods()获取所有修饰符类型的方法
        Method[] methods = userClass.getMethods();
        for (Method method : methods) {
            String name = method.getName();
            System.out.println("方法：" + method + ",  方法名：" + name);
            //method.setAccessible(true);
        }

        //2. 获取指定名称的无参方法
        Method noEatMethod = userClass.getMethod("eat");
        Person person = new Person();
        noEatMethod.invoke(person);

        //3. 获取指定名称的有参方法
        Method allEatMethod = userClass.getMethod("eat", String.class);
        allEatMethod.invoke(person,"orange");

        //获取类名
        String className = userClass.getName();
        System.out.println("类名：" + className);
    }
}