package com.kpmg.datatypes;
/**
 * Datatypes explained
 */
public class Demo1Datatypes {

	public static void main(String[] args) {

		byte a = 100;  // 8 bits
		short b = 100; //16 bits
		int c = 100; //32 bits 
		long d=100898989898L; //64 bits 
		
		float e=10.0f; //32 bits
		double f=10.2; //64 bits 
		
		//% of 1000 students 
		
		//int --> 32000 bits of memory will be used
		//byte --> 8000 bits of memory will be used
		
		boolean check=true; // 1bit
		char letter='b'; //16 bits 
		
		
		
		float x=1.12345f;
		
		double z=x; //implicit coversion --> 32 bits to 64 bits 
		z=c; //implicit coversion --> 32 bits to 64 bits 
		
		double u=10;
		int y= (int) u; //64 bits to 32 bits --> explicit conversion --> data loss might happens
		
	
		String myName="bala"; //4*16 bits 
		
		System.out.println(myName);
		System.out.println(myName.toUpperCase());
		
		System.out.println(myName.length());
		
		System.out.println(myName.charAt(0));  
		
		System.out.println(y);
		
		System.out.println(myName.contains("bat"));
		
		
		//automatically picks the datatype during compile time based on the value you store 
		var demo1=myName.toUpperCase();
//		var letter1= myName.charAt(4);
//		demo1=25;
//		
//		demo1=24.3;
		
		
		
	}
}
