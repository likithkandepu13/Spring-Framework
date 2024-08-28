package com.klu.JFSDS25_SPRING_Hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationcontext.xml");
        EmployeeDAO dao = (EmployeeDAO) ac.getBean("empdao");
        Employee e = new Employee();
        e.setEid(111);
        e.setEname("Likith Anju");
        e.setEsal(85555);
        dao.insertEmployee(e);
        System.out.println("Successfully inserted");
    }
}
