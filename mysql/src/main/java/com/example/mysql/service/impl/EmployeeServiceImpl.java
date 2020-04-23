package com.example.mysql.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.entity.Employee;
import com.example.mysql.repository.EmployeeRepository;
import com.example.mysql.service.EmployeeService;

@Service 
public class EmployeeServiceImpl implements EmployeeService 
{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void execute()
	{
		
		List<Employee> empList = new ArrayList<>();
		
		for(int i=0;i<10000;i++)
		{
			Employee e = new Employee();
			e.setEid(i);
			e.setFirstName("Anand");
			e.setLastName("kumar");
			empList.add(e);
		}
		
		employeeRepository.saveAll(empList);
		
		
	}

}
