package com.klu.JFSDS25_Spring_JDBC_;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.List;


public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        EmployeeDAO dao = (EmployeeDAO) ac.getBean("empdao");
        Employee e = new Employee();

        // Insert Employee
        e.setEid(1);
        e.setEname("ABC");
        e.setEsal(100000);
        dao.insertEmployee(e);
        System.out.println("Inserted");

        // Update Employee
        e = new Employee();
        e.setEid(1);
        e.setEname("ABC-updated");
        e.setEsal(90000);
        dao.updateEmployee(e);
        System.out.println("Updated");

        // Get Employee List
        List<Employee> l = dao.getEmployees();
        for (Employee emp : l) {
            System.out.println(emp.getEid() + " " + emp.getEname() + " " + emp.getEsal());
        }

        // Get specific Employee
        e = dao.findEmployee(1);
        System.out.println(e.getEid() + " " + e.getEname() + " " + e.getEsal());

        // Delete Employee
        dao.deleteEmployee(1);
        System.out.println("Deleted");
    }
}
