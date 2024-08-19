package com.klu.JFSDS25_SpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) 
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        Employee e = (Employee) ac.getBean("empbean");
        System.out.print(e.getEname());
    }
}
