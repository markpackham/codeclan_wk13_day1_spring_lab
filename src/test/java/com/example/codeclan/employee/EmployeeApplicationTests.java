package com.example.codeclan.employee;

import com.example.codeclan.employee.models.Employee;
import com.example.codeclan.employee.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee mark = new Employee("Mark The Magnificent", 21, 666, "mark@awesome.com");
		employeeRepository.save(mark);
	}

}
