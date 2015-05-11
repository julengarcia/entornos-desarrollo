/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author julen
 *
 */
public class LoopsExercise5 {

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
		
		//CON FOR
		if (number > 0) {
			for (int i = 0; i < number; i++) {
				for (int j = 0; j < number; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		} else {
			System.out.println("Invalid number");
			System.exit(0);
		}

	}

}
