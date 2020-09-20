package com.example.demojpaspecification.controller;

import com.example.demojpaspecification.model.Employee;
import com.example.demojpaspecification.repository.EmployeeRepository;
import com.example.demojpaspecification.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value = "/data")
    public ResponseEntity<String> injectData(){

        Employee employee = new Employee();
        employee.setFirstName("Peter");
        employee.setLastName("Johnson");
        employee.setAge(25);
        employeeRepository.save(employee);

        return new ResponseEntity<>("Success", HttpStatus.OK);

    }




}
