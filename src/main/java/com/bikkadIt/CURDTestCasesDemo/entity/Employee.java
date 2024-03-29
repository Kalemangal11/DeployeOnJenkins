package com.bikkadIt.CURDTestCasesDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	private int empId;
	
	private String empName;
	
	private String empAge;
}
