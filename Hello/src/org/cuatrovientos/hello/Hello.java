package org.cuatrovientos.hello;

public class Hello {
	
	private String greet = "Hello";
	
	/**
	 * says hello on console
	 */
	public void sayHello () {
		System.out.println(greet);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Hello myHello = new Hello();
		myHello.sayHello();
		
	}

}
