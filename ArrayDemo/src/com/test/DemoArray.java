package com.test;

public class DemoArray {

	public static void main(String[] args) {
		
		//Decleraing and instatntiating the array
		int[] i = new int[5];
		i[0] = 10; //Assigning the value
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		System.out.println("The length of array: "+i.length );
		//retriving the value
		for (int j =0; j<i.length; j++) {
			System.out.println(i[j]); //fetching the value
		}

	}

}
