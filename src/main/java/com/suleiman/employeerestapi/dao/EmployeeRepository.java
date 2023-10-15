package com.suleiman.employeerestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suleiman.employeerestapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
