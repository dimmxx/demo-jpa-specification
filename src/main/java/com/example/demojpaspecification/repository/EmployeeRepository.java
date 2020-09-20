package com.example.demojpaspecification.repository;

import com.example.demojpaspecification.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
