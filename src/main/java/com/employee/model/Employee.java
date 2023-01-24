package com.employee.model;

public class Employee {
	
	String employee_name;
	String mailid;
	int number;
	String state;
	String job_role;
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getJob_role() {
		return job_role;
	}
	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}
	public Employee(String employee_name, String mailid, int number, String state, String job_role) {
		super();
		this.employee_name = employee_name;
		this.mailid = mailid;
		this.number = number;
		this.state = state;
		this.job_role = job_role;
	}
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [employee_name=" + employee_name + ", mailid=" + mailid + ", number=" + number + ", state="
				+ state + ", job_role=" + job_role + "]";
	}
	
	

}
