/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author julen
 *
 */
public class LoopsExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0;
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		//Ask a number
		System.out.println("Enter the number : ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		if (number > 0 && number % 2 == 0) {
			for (int i = 0; i < number; i ++) {
				System.out.print("*");
			}
		} else {
			System.out.println("Invalid number");
			System.exit(0);
		}

	}

}
