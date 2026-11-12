package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setEmpName("John Doe");
        employees.add(emp1);
        Employee emp2 = new Employee();
        emp2.setEmpId(1);
        emp2.setEmpName("John Doe");
        employees.add(emp2);

        System.out.println("Employees: " + employees);

        System.out.println("emp1 == emp2: " + (emp1.equals(emp2)));

        System.out.println("emp1 == emp2: " + (emp1==emp2));
        System.out.println("emp1 == emp2: " + (emp1.hashCode()));
        System.out.println("emp1 == emp2: " + (emp2.hashCode()));

    }

}
