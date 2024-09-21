package com.klu.JFSDS25_Spring_JDBC_;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOClass implements EmployeeDAO {
    DataSource dt;
    JdbcTemplate jt;

    public void setDataSource(DataSource dt) {
        this.dt = dt;
    }

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public void insertEmployee(Employee emp) {
        String sql = "insert into employee values(?, ?, ?)";
        jt.update(sql, emp.getEid(), emp.getEname(), emp.getEsal());
    }

    @Override
    public void updateEmployee(Employee emp) {
        String sql = "UPDATE employee SET name=?, sal=? WHERE id=?";
        jt.update(sql, emp.getEname(), emp.getEsal(), emp.getEid());
    }

    @Override
    public void deleteEmployee(int eid) {
        String sql = "delete from employee where id = ?";
        jt.update(sql, eid);
    }

    @Override
    public Employee findEmployee(int eid) {
        String sql = "select * from employee where id = ?";
        Employee e = jt.queryForObject(sql, new Object[]{eid}, new EmployeeMapper());
        return e;
    }

    @Override
    public List<Employee> getEmployees() {
        String sql = "select * from employee";
        List<Employee> employees = jt.query(sql, new EmployeeMapper());
        return employees;
    }
}
