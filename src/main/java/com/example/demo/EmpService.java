package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {
    private final EmployeeRepository empRepository;

    public EmpService(EmployeeRepository empRepository) {
        this.empRepository = empRepository;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(empRepository.findAll());
    }

    public List<Employee> saveEmployee(Employee employee) {
        empRepository.save(employee);
        return getAllEmployees();
    }

    public List<Employee> deleteEmpDetails(@PathVariable int empId) {
        empRepository.deleteById(empId);
        return getAllEmployees();
    }
}

