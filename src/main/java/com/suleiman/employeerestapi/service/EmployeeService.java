package com.suleiman.employeerestapi.service;

import java.util.List;

import com.suleiman.employeerestapi.entity.Employee;

public interface EmployeeService {
	List<Employee> findAll();

	Employee findById(Integer id);

	Employee save(Employee theEmployee);

	void deleteById(Integer id);
}
