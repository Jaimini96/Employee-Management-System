package com.flp.ems.dao;

import java.util.ArrayList;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	public void addEmployee(Employee e);
		
	
	public void modifyEmployee(Employee e);
		

	public void removeEmployee(int e);
		
	

	public ArrayList<Employee> searchEmployee(String s);
		
	

	public ArrayList<Employee> getAllEmployee();
}
