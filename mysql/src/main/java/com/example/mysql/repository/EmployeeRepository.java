package com.example.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{

}
