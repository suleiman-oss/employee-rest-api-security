package com.suleiman.employeerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suleiman.employeerestapi.dao.EmployeeRepository;
import com.suleiman.employeerestapi.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(Integer id) {
		Optional<Employee> res = employeeRepository.findById(id);
		if (!res.isPresent()) {
			throw new RuntimeException("Cannot find employee with id: " + id);
		}
		return res.get();
	}

	@Override
	public Employee save(Employee theEmployee) {
		return employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(Integer id) {
		employeeRepository.deleteById(id);

	}
}
