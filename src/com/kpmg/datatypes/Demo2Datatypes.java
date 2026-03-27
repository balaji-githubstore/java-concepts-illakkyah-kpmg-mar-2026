package com.kpmg.datatypes;

public class Demo2Datatypes {

	public static void main(String[] args) {
		
		//10,20,30,40,50
		
		int[] numbers=new int[5];  //5*32 bits 
		
		numbers[0]=10;
//		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers);
		
		System.out.println(numbers[1]);
		
		double[] arr=new double[4]; //4*64 bits
		
		System.out.println(arr);
		
		arr[0]=10; //32 to 64 bits 
		arr[1]=12.3f; //32 to 64 bits

		
		System.out.println(arr[2]);
		
		
		//Char array with size 4 and store &,$,&
		
		String[] colors=new String[3];
		colors[0]="666";
		colors[1]="yellow";
		colors[2]="green";
		
		//14*16 bits 
		
		System.out.println(colors);
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		
		
		String[] arr2= {"red","blue","red","yellow"};
		
		System.out.println(arr2[1]);
		
		
		double radius=10.2;
		
		double result= (4*3.14*radius*radius*radius)/3;
		System.out.println(result);
	}
}



