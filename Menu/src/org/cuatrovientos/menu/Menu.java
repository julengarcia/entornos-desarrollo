/**
 * 
 */
package org.cuatrovientos.menu;

import java.util.Random;
import java.util.Scanner;

/**
 * @author julen
 *
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		do {
			showMenu();
			
			option = reader.nextLine();
			
			switch (option) {
				case "1":
					System.out.println("You selected 1 ");
					sayHello();
					break;
				case "2":
					System.out.println("You selected 2 ");
					insult();
					break;
				case "3":
					System.out.println("You selected 3 ");
					sayYouLoveMe();
					break;
				case "4":
					System.out.println("You selected 4 ");
					System.out.println("Byeeeeeee");
					break;
				default:
					System.out.println("Incorrect option");
					break;
			}
			
		} while (!option.equals("4"));
		
		
		
	}
	/**
	 * show menu
	 */

	public static void showMenu() {
		System.out.println("Please select: ");
		System.out.println("1) Say hello ");
		System.out.println("2) Insult me ");
		System.out.println("3) Say that you love me ");
		System.out.println("4) Exit ");
	}
	
	/**
	 * says I love you 
	 */
	
	public static void sayYouLoveMe() {
		System.out.println("I love you so much");
		
	}

	/**
	 * says insults
	 */

	public static void insult() {
		String[] insults = {"Cocksucker","Bitch","Queer","Faggot","Madafaka"};
		Random random = new Random();
		int index = random.nextInt(insults.length);
		System.out.println(insults[index]);
		
	}
	
	/**
	 * says Hello
	 */
	
	public static void sayHello() {
		System.out.println("Hello");
		System.out.println("How are you?");
	}

}
