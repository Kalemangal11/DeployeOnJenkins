package com.bikkadIt.CURDTestCasesDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.CURDTestCasesDemo.entity.Employee;
import com.bikkadIt.CURDTestCasesDemo.service.EmpServiceI;

@RestController
@RequestMapping("/api")
public class EmpController{

	@Autowired
	private EmpServiceI empservice;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp){
		Employee createdEmp = empservice.createEmp(emp);
		return new ResponseEntity<Employee>(createdEmp,HttpStatus.OK);
		
	}
}
