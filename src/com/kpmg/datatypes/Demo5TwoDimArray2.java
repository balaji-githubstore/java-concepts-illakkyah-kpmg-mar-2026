package com.kpmg.datatypes;

public class Demo5TwoDimArray2 {
	
	public static void main(String[] args) {
		
		
		String[][] arr=new String[3][2];
		
		arr[0][0]="john";
		arr[0][1]="john123";
		
		arr[1][0]="saul";
		arr[1][1]="saul123";
		
		arr[2][0]="kim";
		arr[2][1]="kim123";
		
		
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
	}

}
