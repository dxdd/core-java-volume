package com.sean.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 反射：开闭原则
 *
 * @Author: sean
 * @Date: 2021/9/16 17:29
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        //传统
        Cat cat = new Cat();
        cat.hi();

        //1
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\com\\sean\\reflection\\re.properties"));

        String method = properties.get("method").toString();
        String classFullPath = properties.get("classFullPath").toString();
        System.out.println(method);
        System.out.println(classFullPath);

        Class cls = Class.forName(classFullPath);
        Object o = cls.newInstance();
        System.out.println(o.getClass());

        Method method1 = o.getClass().getMethod(method);
        method1.invoke(o);

        //得到name字段  getField不能得到私有的
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));

        //获取构造器
        Constructor constructor = cls.getConstructor();
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor);
        System.out.println(constructor1);
    }
}
