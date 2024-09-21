package com.klu.JFSDS25_Spring_JDBC_;

import java.util.List;

public interface EmployeeDAO {
    void insertEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void deleteEmployee(int eid);
    Employee findEmployee(int eid);
    List<Employee> getEmployees();
}
