package com.neev.java.assignment;

public class Log {
	
	public static void calculateLog(int base, int num){
		
		int division = 0;
		int temp = num;
		
		while(base <= num){
			
			num = num/base;
			division++;
		}
		
		System.out.println("\nFloor of Log " + temp + " on base " + base + " is "+ division + ".\n\n" );
	}

}
