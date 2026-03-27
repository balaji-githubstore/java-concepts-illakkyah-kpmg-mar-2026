package com.kpmg.schoolmanagement;

public class StudentRunner {
	
	public static void main(String[] args) {
		
		Student s1=new Student(101);
		Student s2=new Student(102,"kim");
		
		Student s3=new Student("saul", 103);
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		s1.setName("jack");
		s1.setMailId("jack@global.com");
		
		s2.setMailId("bala@gmail.com");
		
		
		String name1=s1.getName();
		System.out.println(name1);
		
		
		System.out.println(s1.getMailId());
		
		System.out.println(s2.getName());
		System.out.println(s2.getMailId());
		
		
	 
		
	}

}
