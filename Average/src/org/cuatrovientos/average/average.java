/**
 * 
 */
package org.cuatrovientos.average;

import java.util.Scanner;

/**
 * Simple class to calculate the average of 5 numbers
 * @author julen
 *
 */
public class average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int result = 0;
		
		// To read from console
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		//Ask the numbers
		System.out.println("Enter 5 numbers: ");
		
		//Read from console
		line = reader.nextLine();
		//Converts line to int
		num1 = Integer.parseInt(line);
		
		line = reader.nextLine();
		num2 = Integer.parseInt(line);
		
		line = reader.nextLine();
		num3 = Integer.parseInt(line);
		
		line = reader.nextLine();
		num4= Integer.parseInt(line);
		
		line = reader.nextLine();
		num5 = Integer.parseInt(line);
		
		result = (num1 + num2 + num3 + num4 + num5) / 5;
		System.out.println("Result is " + result);

	}
}
