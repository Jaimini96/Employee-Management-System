package com.flp.ems.domain;

import java.util.HashMap;

public class Employee {
	public static int emp_id;
	String name;
	String email_id;
	String phone;
	String dob;
	String doj;
	String address;
	String dept;
	String proj;
	String role;
	int emp_id1;
	HashMap<String, String> newEmp;
	public Employee(){};
	public Employee(String name, String email_id, String phone,String dob,String doj,String address, String dept,String proj, String role){
		this.name=name;
		this.email_id=email_id;
		this.phone=phone;
		this.dob=dob;
		this.doj=doj;
		this.address=address;
		this.dept=dept;
		this.proj=proj;
		this.role=role;
		emp_id++;
		this.emp_id1=emp_id;
		
		System.out.println("YOLO123"+ emp_id);
		
	}
	public Employee(int emp_id,String name, String email_id, String phone,String dob,String doj,String address, String dept,String proj, String role){
		this.name=name;
		this.email_id=email_id;
		this.phone=phone;
		this.dob=dob;
		this.doj=doj;
		this.address=address;
		this.dept=dept;
		this.proj=proj;
		this.role=role;
		//this.emp_id+=1;
		int temp = emp_id;
		this.emp_id1 = emp_id;
		//emp_id=temp;
		System.out.println("YOLO123"+ emp_id);
	}
	public int getEmpId1(){
		return emp_id1;}
	public String getName(){
		return name;}
	public void getDetails(){
		System.out.println("Employee ID: "+emp_id1+" \t"+"Name: " +name+ "\t"+"Email ID: "+email_id+"\t"+"Phone number: "+phone+"\t"+"Date of birth: " +dob+"\t"+"Date of Joining: " +doj+"\t"+"Address: "+address+"\t"+"Department ID: "+dept+"\t"+"Project ID: "+proj+"\t"+"Role ID: "+role+"\t");
	}
	
	public void searchEmpByName(){
		System.out.println("Employee ID: "+emp_id1+" \t"+"Name: " +name+ "\t"+"Email ID: "+email_id+"\t"+"Phone number: "+phone+"\t"+"Date of birth: " +dob+"\t"+"Date of Joining: " +doj+"\t"+"Address: "+address+"\t"+"Department ID: "+dept+"\t"+"Project ID: "+proj+"\t"+"Role ID: "+role+"\t");
	}
}
