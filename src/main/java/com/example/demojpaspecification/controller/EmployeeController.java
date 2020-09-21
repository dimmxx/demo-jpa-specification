package com.example.demojpaspecification.controller;

import com.example.demojpaspecification.model.Employee;
import com.example.demojpaspecification.model.Phone;
import com.example.demojpaspecification.model.PhoneType;
import com.example.demojpaspecification.model.PhoneTypeEnum;
import com.example.demojpaspecification.repository.EmployeeRepository;
import com.example.demojpaspecification.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashSet;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value = "/data")
    public ResponseEntity<String> injectData(){

        Set<Employee> employeeSet = new LinkedHashSet<>();

        PhoneType phoneTypeWork = new PhoneType();
        phoneTypeWork.setPhoneTypeEnum(PhoneTypeEnum.WORK);
        phoneTypeWork.setDescription("work phone");

        PhoneType phoneTypeHome = new PhoneType();
        phoneTypeWork.setPhoneTypeEnum(PhoneTypeEnum.HOME);
        phoneTypeWork.setDescription("home phone");

        PhoneType phoneTypeMobile = new PhoneType();
        phoneTypeWork.setPhoneTypeEnum(PhoneTypeEnum.MOBILE);
        phoneTypeWork.setDescription("mobile phone");


        Employee employee1 = new Employee();
        employee1.setFirstName("Peter");
        employee1.setLastName("Johnson");
        employee1.setAge(25);

        Phone phone1_1 = new Phone();
        phone1_1.setPhoneNumber("+380673998776");
        phone1_1.setEmployee(employee1);
        phone1_1.setPhoneType(phoneTypeMobile);

        Phone phone1_2 = new Phone();
        phone1_2.setPhoneNumber("+380444333443");
        phone1_2.setEmployee(employee1);
        phone1_2.setPhoneType(phoneTypeWork);

        employeeSet.add(employee1);


        Employee employee2 = new Employee();
        employee2.setFirstName("Mary");
        employee2.setLastName("Bay");
        employee2.setAge(45);

        Phone phone2_1 = new Phone();
        phone2_1.setPhoneNumber("+380502104545");
        phone2_1.setEmployee(employee2);
        phone2_1.setPhoneType(phoneTypeHome);

        Phone phone2_2 = new Phone();
        phone2_2.setPhoneNumber("+380931234521");
        phone2_2.setEmployee(employee2);
        phone2_2.setPhoneType(phoneTypeMobile);

        employeeSet.add(employee2);

        employeeSet.forEach(e -> employeeRepository.save(e));








        return new ResponseEntity<>("Success", HttpStatus.OK);

    }




}
