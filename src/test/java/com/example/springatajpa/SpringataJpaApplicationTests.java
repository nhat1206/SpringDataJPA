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
    void findAll(){
        List<Employee> employees = emploeeRepository.findAll();
        employees.forEach(System.out::println);
    }

    @Test
    void createEmployee(){
        Employee employee = new Employee();
        employee.setFirstName("Han");
        employee.setLastName("Solo");
        employee.setJob("Teacher");
        emploeeRepository.save(employee);
    }

    @Test
    void updateEmployee(){
        Employee employee = new Employee();
        employee.setId(3);
        employee.setFirstName("Harry");
        employee.setLastName("Style");
        employee.setJob("Celebrity");
        emploeeRepository.save(employee);
    }

    @Test
    void deleteEmployee(){
        emploeeRepository.deleteById(2);
    }
}
