package com.example.springatajpa;

import entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repository.EmploeeRepository;

import java.util.List;

@SpringBootTest
class SpringataJpaApplicationTests {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private EmploeeRepository emploeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void findEmployeeByJobs(){
        List<Employee> employees = emploeeRepository.findEmployeeByJobs();
        System.out.println(employees);
    }

    @Test
    void deleteEmployeeByFirstName(){
        emploeeRepository.deleteEmployeeByFirstName();
    }
}
