/**
 * 
 */
package org.cuatrovientos.oop;

/**
 * Represents a regular person
 * @author julen
 *
 */
public class Person {
	public String name;
	protected int age;
	private String phone;
	
	/**
	 * default constructor
	 */
	public Person () {
		name = "Rutiger";
		age = 42;
		phone = "666000666";
	}
	
	/**
	 * says hello
	 * @return hello
	 */
	public String sayHello () {
		return "Hello";
	}
	
	/**
	 * returns hello
	 * @return
	 */
	private String hello () {
		return "hello";
	}
}
