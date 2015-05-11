/**
 * 
 */
package org.cuatrovientos.converseexercise;

import java.util.Scanner;

/**
 * simple class to converse euros into dolars, yens or libras
 * @author julen
 *
 */
public class ConverseExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float money = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		String currency = "";
		float result = 0;
		
		//Ask the money in euros
		System.out.println("Introduce the ammount money you want to converse");
		line = reader.nextLine();
		money = Float.parseFloat(line);
		
		// Ask user d/y/l
		System.out.println("Introduce the result of the money, dolars, yens or libras (d/y/l)");
		currency = reader.nextLine();
		
		// Convert euros to that currency
		switch (currency) {
		case "d": 
			result = money * 1.26588f;
			break;
		case "y": 
			result = money * 136.26f;
			break;
		case "l":  // MAGIC NUMBERS
			result = money * 0.787006326f;
			break;
		}
		System.out.println(money + "-> "+ result);
		

	}

}
