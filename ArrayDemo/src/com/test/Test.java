package com.test;

import java.io.FileInputStream;
import java.util.Properties;

public class Test {
	
	public static void main(String[] args) {
		try {
			//Reading the file
			FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\Desktop\\test.properties");
			//Locate the properties
			Properties properties = new Properties();
			properties.load(fis);
			
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			
			System.out.println("Username: "+username);
			System.out.println("Password: "+password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
