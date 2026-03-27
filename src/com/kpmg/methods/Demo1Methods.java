package com.kpmg.methods;

import com.kpmg.formulae.Area;

public class Demo1Methods {

	public static void main(String[] args) {
		
		//allocate memory to all non-static methods 
		Area obj=new Area();

		int radius = 10;
		double result = obj.areaOfCircle(10);
		System.out.println(result);

		result = Area.areaOfRectangle(10, 10.29);
		System.out.println(result);

		System.out.println(obj.areaOfCircle(9));
		
		String myName=Area.getAuthorName();
		System.out.println(myName);
		
		obj.quit();
	}

}
