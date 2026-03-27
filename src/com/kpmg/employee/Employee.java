package com.kpmg.employee;

public class Employee {

	private int id;
	public String name;
	public String performance;
	public double salary;
	public static String companyName;
	public static int counter=101;
	
	
	public Employee()
	{
		id=counter;
		counter++;
	}

	public void printEmployeeDetail()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(performance);
		System.out.println(Employee.companyName);
		System.out.println("--------------------------------");
	}
	
//	public static void printEmpDetail(Employee x)
//	{
//		System.out.println(x.id);
//		System.out.println(x.name);
//		System.out.println(x.salary);
//		System.out.println(x.performance);
//		System.out.println(Employee.companyName);
//	}
	
	public static void printAllEmployee(Employee[] emps)
	{
		System.out.println(emps);
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee();
		return e;
	}
	
	public boolean employeePresent()
	{
		return true;
	}
}


