/**
 * 
 */
package org.cuatrovientos.conditionals;

import java.util.Scanner;

/**
 * @author julen
 *
 */
public class ConditionalsExercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		//Ask a number
		System.out.println("Enter a number: ");
		line = reader.nextLine();
		a = Integer.parseInt(line);
		
		if (a > 0) {
			System.out.println("The number is positive");
		} else {
			if (a == 0) {
			System.out.println("The number is 0");
			} else {
				System.out.println("The number is negative");
			}
			
		}

	}

}
