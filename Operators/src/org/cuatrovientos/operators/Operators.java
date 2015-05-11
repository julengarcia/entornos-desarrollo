/**
 * 
 */
package org.cuatrovientos.operators;

/**
 * Simple class to make use of operators
 * @author julen
 *
 */
public class Operators {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int result = 0;
		// Operators: + - * / %
		result = a + b;
		result = a + 42;
		result = 10 / (2 - b);
		result = 10 / 3; //Devuelve un 3
		result = 10 % 3; //Devuelve un 1, es como MOD
		System.out.println(result);
		// To negative
		result = -result;
		// Unary operators
		result = a + 1;
		result = a++;
		a = 5;
		a = a + 1;
		System.out.println("a is " + a);
		a++;
		System.out.println("a is " + a);
		a--;
		System.out.println("a is " + a);
		++a;
		a++; //Son iguales
		System.out.println(a);
		result = ++a;
		System.out.println(result + " " + a);
		result = a++; //
		System.out.println(result + " " + a);
		
		// equivalent
		a = a + 5;
		a += 5; //+=, -= *= /= %= SE PUEDE PERO NO USAR
		
		
		
		
	}

}
