/**
 * 
 */
package org.cuatrovientos.conditionals;

/**
 * simple class to use conditionals
 * @author julen
 *
 */
public class Conditionals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		if (a > b) {
			System.out.println("a is bigger than b");
		} else {
			if (a == b) {
				System.out.println("a and b are equal");
			} else {
				System.out.println("a is smaller than b");
			}
			
		}
		
		switch (a) {
			case 0:
				System.out.println("A is 0");
				break;
			case 1:
				System.out.println("A is 1");
				break;
			case 5:
				System.out.println("A is 5");
				break;
			default:
				System.out.println("I don,t know what A is");
				break;
		}
		
		System.out.println("Program ended.");

	}

}
