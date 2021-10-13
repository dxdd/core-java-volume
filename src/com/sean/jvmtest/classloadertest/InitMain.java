package com.sean.jvmtest.classloadertest;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @Author: sean
 * @Date: 2021/9/9 10:35
 */
public class InitMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clzStr = Class.forName("java.lang.String");           //得到实例
        Method[] ms = clzStr.getDeclaredMethods();                  //获取所有方法
        for (Method m : ms) {
            String mod = Modifier.toString(m.getModifiers());       //获得方法的访问标识符
            System.out.print(mod + " " + m.getName() + " (");
            Class<?>[] ps = m.getParameterTypes();                  //取得方法所有参数
            if (ps.length == 0)
                System.out.print(')');
            for (int i = 0; i < ps.length; i++) {
                char end = i == ps.length - 1 ? ')' : ',';
                System.out.print(ps[i].getSimpleName() + end);    //输出方法的参数
            }
            System.out.println();
        }
    }
}
