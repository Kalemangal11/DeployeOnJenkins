package com.bikkadIt.CURDTestCasesDemo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.bikkadIt.CURDTestCasesDemo.entity.Employee;
import com.bikkadIt.CURDTestCasesDemo.repo.EmpRepo;
import com.fasterxml.jackson.databind.ObjectMapper;


@SpringBootTest
class EmpServiceImplTest {
	
	@Mock
	EmpRepo empRepo;
	
	@Mock
	ObjectMapper objectMapper;
	
	@InjectMocks
	EmpServiceI empServiceI;
			

	@Test
	void createEmptest() {
		
		Employee emp=new Employee();
		emp.setEmpName("Mangal");
		
		Integer i=1;
		
		when(empRepo.getById(i)).thenReturn(emp);	
		
		Employee createdEmp = empServiceI.createEmp(emp);
		
		assertEquals(emp, createdEmp);
	}

}
