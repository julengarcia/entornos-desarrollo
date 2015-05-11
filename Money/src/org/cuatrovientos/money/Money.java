package org.cuatrovientos.money;

import java.util.Scanner;

/**
 * Simple class to pass $ to €
 * @author julen
 *
 */

public class Money {

	public static void main(String[] args) {
		float money = 0;
		
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter the money you want to change in  $:");
		
		line = reader.nextLine();
		money = Float.parseFloat(line);
		
		System.out.println("Result is " + money * 0.7937 + " € ");		

	}

}
