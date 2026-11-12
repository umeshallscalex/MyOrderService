package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JDBFactoryService {

   private final JdbcTemplate jdbcTemplate;
    public JDBFactoryService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public List<EmpDptStudent> getEmpDptStudents(int empid) {
        final String SQL = "select  e.emp_id,e.emp_name,e.departmentid,d.department_name,s.student_id,s.student_name from EMPLOYEE e,DEPARTMENT d, Student s \n" +
                "where e.departmentid= d.departmentid and e.departmentid= s.department_id and e.emp_id = ?";
        return jdbcTemplate.query(SQL,
                (rs, rowNum) -> new EmpDptStudent(
                        rs.getInt("emp_id"),
                        rs.getInt("departmentid"),
                        rs.getString("department_name"),
                        rs.getInt("student_id"),
                        rs.getString("student_name")
                ), empid);
    }

}
