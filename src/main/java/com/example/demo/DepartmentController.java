package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @Autowired
    JDBFactoryService jdbcFactoryService;

    @GetMapping("/all")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/add")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/detailsEmp/{empId}")
    public List<EmpDptStudent> getDepartmentByEmployeeId(@PathVariable int empId) {
        return jdbcFactoryService.getEmpDptStudents(empId);
    }
}
