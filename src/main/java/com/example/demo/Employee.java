package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Entity
public class Employee {

    @Id
    int empId;
    String empName;
    int departmentID;

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName);
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
