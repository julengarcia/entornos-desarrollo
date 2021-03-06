/**
 * 
 */
package org.cuatrovientos.methods;

import java.util.Scanner;

/**
 * The mighty calculator
 * @author julen
 *@version 1.0
 */
public class Calculadora {
	
	/**
	 * Add two int numbers and returns result
	 * @param numberA
	 * @param numberB
	 * @return the result
	 */

	public static int add (int numberA, int numberB) {
		int result = 0;
		result = numberA + numberB;
		return result;
		
	}
	
	/**
	 * Subtract two int numbers and returns result
	 * @param numberA
	 * @param numberB
	 * @return the result
	 */
	
	public static int subtract (int numberA, int numberB) {
		int result = 0;
		result = numberA - numberB;
		return result;
	}
	
	/**
	 * Multiply two int numbers and returns result
	 * @param numberA
	 * @param numberB
	 * @return the result
	 */
	
	public static int multiply (int numberA, int numberB) {
		int result = 0;
		result = numberA * numberB;
		return result;
	}
	/**
	 * Divide two int numbers and returns result
	 * @param numberA
	 * @param numberB
	 * @return the result
	 */
	
	public static int divide (int numberA, int numberB) {
		int result = 0;
		result = numberA / numberB;
		return result;
	}
	
	/**
	 * Asks for a number, converts it and returns it
	 * @return the number
	 */
	
	public static int readNumber () {
		int result = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		System.out.println("Please enter number: ");
		line = reader.nextLine();
		result = Integer.parseInt(line);
		
		return result;	
	}
		
	public static void main(String[] args) {
		int numberA = 0;
		numberA = readNumber();
		int numberB = 0;
		numberB = readNumber();
		
		System.out.println(add(numberA,numberB)); 
		System.out.println(subtract(numberA,numberB)); 
		System.out.println(multiply(numberA,numberB)); 
		System.out.println(divide(numberA,numberB)); 
		

	}

}
