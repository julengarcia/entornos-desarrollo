/**
 * 
 */
package org.cuatrovientos.arrays;

import java.util.Scanner;

/**
 * @author julen
 *
 */
public class ArraysExercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String [] Words = {"","","","","","","","","",""};
		
		System.out.println("Enter words in this array ");
		
		for (int i = 0 ; i < 10; i++) {
			System.out.print("Enter the word " + (i + 1) + ": ");
			Words[i] = reader.nextLine();			
		}
		for (int i = 0;i<10; i++) {
			System.out.print(Words[i] + " ");
		}
		

	}

}
