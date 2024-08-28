package com.klu.JFSDS25_SPRING_Hibernate;

import java.util.List;

public interface EmployeeDAO {
	void insertEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Employee emp);
	List<Employee> getEmployee();
	Employee findEmployee(int eid);
	
	

}
