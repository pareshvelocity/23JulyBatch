package com.test;

public class ArrayDemo2 {
	
	public static void main(String[] args) {
		//Declaration, instantiation and initialization in single line
		int[] a = {10,20,30,40};
		
		//printing
//		for(int i =0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		//Printing the value by using for-each loop
		for(int i:a) {
			System.out.println(i);
		}
	}

}
