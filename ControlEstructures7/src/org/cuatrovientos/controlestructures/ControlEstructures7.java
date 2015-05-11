package org.cuatrovientos.controlestructures;

import java.util.Scanner;

/**
 * Simple class to practise swich case
 * @author julen
 *
 */

public class ControlEstructures7 {
	
	public static void main(String[] args) {
		int number = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		//Ask a number
		System.out.println("Enter the number : ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		//Cheack if number is between 0 and 99
		if (number > 0 && number <= 99)	{
			switch (number) {
			case 1: System.out.println("Goalkepper");
					break;
			case 3:
			case 4:
			case 5:
				System.out.println("Back");
				break;
			case 6:
			case 8:
			case 11:
				System.out.println("Midfield");
				break;
			case 9:
				System.out.println("Striker");
				break;
			default:
				System.out.println("Polivalent");
			
			}
			
		}
	}

}
