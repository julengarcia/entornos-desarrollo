/**
 * 
 */
package org.cuatrovientos.methods;

import java.util.Random;

/**
 * Simple array class with methods
 * @author julen
 * @version 1.0
 */
public class Arrays {
	
	/**
	 * Just a method to initialize the array with numbers
	 * @param myArray
	 * @param number
	 */
	
	public static void initWithNumber (int [] myArray, int number) {
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = number;
		}
	}

	/**
	 * Just a method to show all the numbers in the array
	 * @param myArray
	 */
	
	public static void showAll (int[] myArray) {
		System.out.println("Array content");
		for(int i =0; i < myArray.length; i++) {
			System.out.println(i + 1 + ": " + myArray[i]);
		}			
	}
	/**
	 * Just a method to initialize the array with random number
	 * @param myArray
	 */
	public static void initRandom (int[] myArray) {
		Random random = new Random();
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = random.nextInt(11);
		}
	}
	
	public static int random ( int [] myArray) {
		Random random = new Random();
		int randomIndez = random.nextInt(10);
		return randomIndez;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
