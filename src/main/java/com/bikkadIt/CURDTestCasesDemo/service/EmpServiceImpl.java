package com.bikkadIt.CURDTestCasesDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.CURDTestCasesDemo.entity.Employee;
import com.bikkadIt.CURDTestCasesDemo.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpServiceI{

	@Autowired
	private EmpRepo emprepo;
	
	@Override
	public Employee createEmp(Employee emp) {
		Employee savedEmp = emprepo.save(emp);
		return savedEmp;
	}

}
