package com.example.demo;

import lombok.Data;
@Data
public class EmpDptStudent {
    int empId;
    int departmentId;
    String departmentName;
    int studentId;
    String studentName;

    public EmpDptStudent(int empId, int departmentid, String departmentName, int studentId, String studentName) {
        this.empId = empId;
        this.departmentId = departmentid;
        this.departmentName = departmentName;
        this.studentId = studentId;
        this.studentName = studentName;
    }
}
