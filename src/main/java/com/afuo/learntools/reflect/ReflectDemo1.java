package com.afuo.learntools.reflect;

import com.afuo.learntools.pojo.Person;

/**
 * @Description: TODO
 * @Date: 2021/2/6 08:59
 * @Author: afuo
 */
public class ReflectDemo1 {

    public static void main(String[] args)  throws ClassNotFoundException {
        /*
         * 方法一
         * Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
         * 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
         **/
        Class cls1 = Class.forName("com.afuo.learntools.pojo.Person");   //User自定义实体类
        System.out.println("cls1 = " + cls1);

        /*
         * 方法二
         * 类名.class：通过类名的属性class获取
         * 多用于参数的传递
         **/
        Class cls2 = Person.class;
        System.out.println("cls2 = " + cls2);

        /*
         * 方法三
         * 对象.getClass()：getClass()方法在Object类中定义着。
         * 多用于对象的获取字节码的方式
         **/
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println("cls3 = " + cls3);

        // == 比较三个对象
        System.out.println("cls1 == cls2 : " + (cls1 == cls2));    //true
        System.out.println("cls1 == cls3 : " + (cls1 == cls3));    //true
        //结论：同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，无论通过哪一种方式获取的Class对象都是同一个。
    }
}
