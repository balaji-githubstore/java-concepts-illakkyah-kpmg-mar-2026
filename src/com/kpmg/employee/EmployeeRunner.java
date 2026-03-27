package com.kpmg.employee;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		
	
		Employee.companyName="KPMG";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		Employee emp4= Employee.getEmployeeInstance();
		
		emp4.printEmployeeDetail();
		
//		Employee.getEmployeeInstance().printEmployeeDetail();
		
//		emp1.id=101;
		emp1.name="Jack";
		emp1.salary=9000;
		emp1.performance="A";
		
//		emp2.id=102;
		emp2.name="Saul";
		emp2.salary=7000;
		emp2.performance="C";
		
		
		emp2.printEmployeeDetail();
		emp3.printEmployeeDetail();
		emp1.printEmployeeDetail();
		

//		Employee.printEmpDetail(emp2);
//		Employee.printEmpDetail(emp1);
		
//		Employee[] employees=new Employee[3];
//		
//		employees[0]=emp1;
//		employees[1]=emp2;
//		employees[2]=emp3;
//
//		Employee.printAllEmployee(employees);
		
	}

}
