package com.JFSDS25.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JFSDS25.dao.EmployeeDao;
import com.JFSDS25.model.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDAO;

    @Override
    @Transactional(readOnly = false)
    public void addNewEmployee(Employee e) {
        // Add any necessary validation or logging here
        employeeDAO.addEmployee(e);
    }
}
