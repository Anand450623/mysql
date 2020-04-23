package com.example.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.mysql.service.EmployeeService;

@SpringBootApplication
public class MysqlApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext context =  SpringApplication.run(MysqlApplication.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		service.execute();
	}

}
