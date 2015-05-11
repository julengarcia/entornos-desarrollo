/**
 * 
 */
package org.cuatrovientos.arrays;

import java.util.Scanner;

/**
 * @author julen
 *
 */
public class ArraysExercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String help = "";		
		int [] numbers = {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println("Enter 10 numbers in this array ");
		
		for (int i = 0 ; i < numbers.length; i++) {
			System.out.print("Enter the number " + (i + 1) + ": ");
			help = reader.nextLine();
			numbers[i] = Integer.parseInt(help);
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					System.out.print("There are 2 identical numbers");
					System.exit(0);
					} else {
						System.out.print("There aren,t any identical numbers");
						System.exit(0);						
				}			
			}				
		}
	}

}
