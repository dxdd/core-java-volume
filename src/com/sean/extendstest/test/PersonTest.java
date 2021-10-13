package com.sean.extendstest.test;

import com.sean.extendstest.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: sean
 * @Date: 2021/10/11 15:00
 */
public class PersonTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method1 = Student.class.getMethod("getDescription");
        Student student = new Student("123", "");
        method1.invoke(student);
    }
}
