package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("")
public class EmployeeController {

    @Autowired
    EmpService empService;

    @RequestMapping("/HelloWorld")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/getEmpDetails")
    public List<Employee> getEmpDetails() {
        return empService.getAllEmployees();
    }

    @PostMapping("/addEmpDetails")
    public List<Employee> addEmpDetails(@RequestBody Employee employee) {
        return empService.saveEmployee(employee);
    }

    @PutMapping("/updateEmpDetails")
    public List<Employee> updateEmpDetails(@RequestBody Employee employee) {
        return empService.saveEmployee(employee);
    }

    @DeleteMapping("/deleteEmpDetails/{empId}")
    public List<Employee> deleteEmpDetails(@PathVariable int empId) {
        return empService.deleteEmpDetails(empId);
    }
    
}
