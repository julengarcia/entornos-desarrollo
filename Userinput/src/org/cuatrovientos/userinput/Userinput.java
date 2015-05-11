package org.cuatrovientos.userinput;

import java.util.Scanner;

public class Userinput {
	public static void main(String args []) {
		int a = 0;
		int b = 0;
		int result = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		//Ask a number
		System.out.println("Enter a number: ");
		//Read from console
		line = reader.nextLine();
		System.out.println("You entered : " + line);
		//Converts line to int
		a = Integer.parseInt(line);
		//Ask a number
		System.out.println("Enter a number: ");
		//Read from console
		line = reader.nextLine();
		System.out.println("You entered : " + line);
		//Converts line to int
		b = Integer.parseInt(line);
		
		result = a + b;
		
		System.out.println("Result is " + result);
		
	}	
}
