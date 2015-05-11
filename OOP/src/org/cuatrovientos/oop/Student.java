/**
 * 
 */
package org.cuatrovientos.oop;

/**
 * Represents a student
 * @author julen
 *
 */
public class Student extends Person {
	private String school;
	
	public Student () {
		school = "Cuatrovientos High School";
	}
	
	/**
	 * learns
	 */
	public void learn () {
		System.out.println("I'm learning");
	}

}
