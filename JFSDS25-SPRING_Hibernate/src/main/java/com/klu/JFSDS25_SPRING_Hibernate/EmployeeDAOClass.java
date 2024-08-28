package com.klu.JFSDS25_SPRING_Hibernate;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.support.TransactionTemplate;
import java.util.List;

public class EmployeeDAOClass implements EmployeeDAO {
    private HibernateTemplate ht;
    private TransactionTemplate transactionTemplate;

    public void setHibernateTemplate(HibernateTemplate ht) {
        this.ht = ht;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void insertEmployee(Employee emp) {
        transactionTemplate.execute(status -> {
            ht.save(emp);
            return null;
        });
    }

    @Override
    public void updateEmployee(Employee emp) {
        transactionTemplate.execute(status -> {
            ht.update(emp);
            return null;
        });
    }

    @Override
    public void deleteEmployee(Employee emp) {
        transactionTemplate.execute(status -> {
            ht.delete(emp);
            return null;
        });
    }

    @Override
    public List<Employee> getEmployee() {
        return transactionTemplate.execute(status -> ht.loadAll(Employee.class));
    }

    @Override
    public Employee findEmployee(int eid) {
        return transactionTemplate.execute(status -> ht.get(Employee.class, eid));
    }
}
