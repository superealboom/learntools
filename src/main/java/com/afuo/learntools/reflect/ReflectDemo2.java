package com.afuo.learntools.reflect;

import com.afuo.learntools.pojo.FourModifier;

import java.lang.reflect.Field;

/**
 * @Description: TODO
 * @Date: 2021/2/6 11:40
 * @Author: afuo
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws Exception {
        //0. 获取FourModifier的Class对象
        Class fourModifierClass = FourModifier.class;

        //1. 获取所有public修饰的成员变量
        Field[] fields = fourModifierClass.getFields();
        System.out.println("以下是所有public修饰的成员变量=====");
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();

        //2. 获取指定public修饰的成员变量
        Field testPublicField = fourModifierClass.getField("testPublic");
        FourModifier fourModifier = new FourModifier();
        //修改指定成员变量 testPublic 的值
        testPublicField.set(fourModifier,"get!!!");
        System.out.println("以下是修改指定成员变量testPublic的值=====");
        System.out.println(fourModifier);
        System.out.println();

        //3. 获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = fourModifierClass.getDeclaredFields();
        System.out.println("以下是所有的成员变量，不考虑修饰符=====");
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println();

        //4. 获取指定修饰的成员变量
        //除public外，其余get都会报错，这时可以加上暴力反射
        //以private为例
        Field testPrivateDeclaredField = fourModifierClass.getDeclaredField("testPrivate");

        testPrivateDeclaredField.setAccessible(true);//暴力反射，忽略访问权限修饰符的安全检查

        Object object = testPrivateDeclaredField.get(fourModifier);
        System.out.println("以下为通过private变量获取对象=====");
        System.out.println(object);
    }
}