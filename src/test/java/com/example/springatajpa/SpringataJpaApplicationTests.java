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
    void findEmployeeByJob(){
        List<Employee> employees = emploeeRepository.findEmployeeByJob();
        System.out.println(employees);
    }

    @Test
    void deleteEmployeeById(){
        emploeeRepository.deleteEmployeeById(2);
    }

    @Test
    void updateEmployee(){
        emploeeRepository.updateEmployee("Teacher",5);
    }
}
