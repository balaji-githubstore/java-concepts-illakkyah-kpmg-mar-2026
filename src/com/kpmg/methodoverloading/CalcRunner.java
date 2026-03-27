package com.kpmg.methodoverloading;

public class CalcRunner {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		cal.add(1, 1);
		
		System.out.println("balaji");
		System.out.println(1.2);
		System.out.println(1);
		
		double res= Math.max(1,1.2);
		System.out.println(res);
		
		System.out.println(Math.PI);
		
		System.out.println(Math.sqrt(64));
		
	}
}
