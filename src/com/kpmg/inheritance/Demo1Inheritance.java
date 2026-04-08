package com.kpmg.inheritance;


class Father
{
	public int fAge=60;
	
	public Father()
	{
		System.out.println("father constructor");
		fAge=80;
	}
	
	public void fatherStyle()
	{
		System.out.println("father style!!!");
	}
}

class Son extends Father
{
	public int sAge=20;
	
	public Son()
	{
		System.out.println("son constructor");
		sAge=30;
	}
	
	public void sonStyle()
	{
		System.out.println("son style");
	}
	
	
}

public class Demo1Inheritance {
	public static void main(String[] args) {

		Son s=new Son();
		
		System.out.println(s.fAge);
		System.out.println(s.sAge);
	
		s.fatherStyle();
		s.sonStyle();
		
	}
	
}
