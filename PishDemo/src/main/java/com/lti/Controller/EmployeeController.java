package com.lti.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@RequestMapping("/emp-data.api")
	public Employee check()
	{
		Employee emp=new Employee();
		emp.setEmpno(1001);
		emp.setName("Anusha");
		emp.setSalary(998);
	return emp;	
	}
	public static class Employee {
		private int empno;
		private String name;
		private double salary;

		public int getEmpno() {
			return empno;
		}

		public void setEmpno(int empno) {
			this.empno = empno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
	}
}