package com.henrique;

public class Contador {

	
	private static int count = 0;
	
	public static String getCount() {
		
		count++;
		System.out.println(count);
		return String.valueOf(count);
		
	}
	
}
