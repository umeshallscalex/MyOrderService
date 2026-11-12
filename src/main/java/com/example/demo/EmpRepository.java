package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class EmpRepository {
    public String getEmpName() {
        return "John Doe";
    }
}
