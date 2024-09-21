package com.klu.JFSDS25_Spring_JDBC_;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee e = new Employee();
        e.setEid(rs.getInt("id"));
        e.setEname(rs.getString("name"));
        e.setEsal(rs.getDouble("sal"));
        return e;
    }
}
