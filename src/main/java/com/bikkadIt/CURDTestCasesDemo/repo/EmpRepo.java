package com.bikkadIt.CURDTestCasesDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIt.CURDTestCasesDemo.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Integer>{
	

}
