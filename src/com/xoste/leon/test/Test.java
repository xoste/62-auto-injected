package com.xoste.leon.test;

import com.xoste.leon.pojo.People;
import com.xoste.leon.pojo.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Xoste
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = applicationContext.getBean("people", People.class);
        People people2 = applicationContext.getBean("people", People.class);
        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
        Teacher teacher2 = applicationContext.getBean("teacher", Teacher.class);
        // people的scope属性是prototype 多例 每次获取重新实例化对象
        System.out.println(people == people2);
        // Teacher的scope属性是singleton 单例 每次获取都是同一个实例对象
        System.out.println(teacher == teacher2);
    }
}
