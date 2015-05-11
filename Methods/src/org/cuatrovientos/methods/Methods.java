/**
 * 
 */
package org.cuatrovientos.methods;

import java.util.Date;

/**
 * Shows the use of methods
 * @author julen
 *
 */
public class Methods {
	
	public static void sayHello() {
		System.out.println("Hi there");
		
	}
	/**
	 * Adds to integer values a and b
	 * @param a
	 * @param b
	 * @return
	 */

	public static int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}
	/**
	 * Shows message on console
	 * @param message
	 */
	
	public static void msg (String message) {
		drawLineCustom("*", 42);
		System.out.println(new Date().toString());
		System.out.println(message);
		drawLineCustom("/\\", 21);
	}
	/**
	 * Draw a customize line on console
	 * @param c
	 * @param lenght
	 */
	public static void drawLineCustom (String c, int lenght) {
		String line = "";
		for (int i = 0; i < lenght; i++) {
			line = line + c;
		}
		System.out.println(line);
	}
	/**
	 * 
	 */
	
	public static void drawLine () {
		String line = "";
		for (int i = 0; i < 80; i++) {
			line = line + "-";
		}
		System.out.println(line);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sayHello();
		int c = add(600,66);
		msg("Result is " + c);
		

	}

	

}
