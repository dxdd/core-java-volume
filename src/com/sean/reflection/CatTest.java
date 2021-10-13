package com.sean.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: sean
 * @Date: 2021/9/17 14:58
 */
public class CatTest {

    final static int COUNT = 900000000;

    public static void main(String[] args) throws Exception {
//        method1();
        method2();
    }

    public static void method1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void method2() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\com\\sean\\reflection\\re.properties"));
        String classFullPath = properties.get("classFullPath").toString();
        String methodName = properties.get("method").toString();

        Class cls = Class.forName(classFullPath);
        Object o = cls.newInstance();
        Method method = o.getClass().getMethod(methodName);
        //反射调用优化 ---> 关闭访问检查
        method.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            method.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        //获得属性
        Field field = cls.getField("age");
        System.out.println(field.get(o));
    }
}
