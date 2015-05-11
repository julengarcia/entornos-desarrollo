/**
 * 
 */
package org.cuatrovientos.variables;

/**
 * Simple class to show de definition of variables in java
 * @author julen
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number; // INT = INTEGER
		int theBeast = 666;
		float weight = 78.56f; // FLOAT = DECIMAL
		double jupiterWeight = 35435453.45d; // DOUBLE = DECIMAL but bigger
		int var1, var2, var3; // WE CAN USE THIS BUT BETTER EACH VARIABLE IN EACH LINE
		long distanceToMars = 3455645454651l; // LONG FOR INTEGER BUT BIGGER AND WITHOUT DECIMAL
		short tinyNumber = -6; //SHORT FOR INTEGER BUT SMALLERS THAN INT
		
		char letter = 'A'; // SOLO UNA LETRA ENTRE COMILLAS SIMPLES
		char specialCharacter = '\''; // ASI ESCRIBE COMILLA SIMPLE, PARA CONTRABARRA SERIA '\\'
		
		String myName = "JULEN GARCIA"; // CADENA DE LETRAS
		String myName2 = "JULEN \"THE PLATINUM\" GARCIA " ; // to put comillas inside comillas
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println(theBeast);
		System.out.println("My name is: " + myName2 + "and my weight is " + weight);
		System.out.println("Is this true: " + isTrue);		
	}

}
