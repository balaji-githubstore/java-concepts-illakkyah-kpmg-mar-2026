package com.kpmg.datatypes;

import com.kpmg.employee.Employee;

public class Demo3 {

	public static void main(String[] args) {
		
		
		 	String s1 = "Hello";
	        String s2 = "Hello";
	        
	        
	        String s3 = new String("Hi");
	        String s4 = "Hi";
	 
	        System.out.println("s1 == s2? " + (s1 == s2));
	        System.out.println("s3 == s4? " + (s3 == s4));
	        
	        System.out.println(s3.equals(s4));
	 
//	        s3 = s3.intern();
//	        System.out.println("s3 == s4? " + (s3 == s4));
		
		
		
	}
}
