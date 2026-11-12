package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class EmpServiceTest {

    @Autowired
    private EmpService service;

    @Test
    void saveEmployeeUpdatesExistingEmployeeWithSameId() {
        Employee first = new Employee();
        first.setEmpId(2);
        first.setEmpName("Rajesh");
        service.saveEmployee(first);

        Employee updated = new Employee();
        updated.setEmpId(2);
        updated.setEmpName("Navin");
        var employees = service.saveEmployee(updated);

        assertEquals(1, employees.size());
        assertEquals("Navin", employees.stream()
                .filter(employee -> employee.getEmpId() == 2)
                .findFirst()
                .orElseThrow()
                .getEmpName());
    }
}
