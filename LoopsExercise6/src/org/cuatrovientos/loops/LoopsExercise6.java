/**
 * 
 */
package org.cuatrovientos.loops;

import java.util.Scanner;

/**
 * @author julen
 *
 */
public class LoopsExercise6 {

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
			for (int i = number; i > 0; i--) {
				System.out.print(i + " ");
				number = number - 1;
			}
		} else {
			System.out.println("Invalid number");
			System.exit(0);
		}

	}

}
