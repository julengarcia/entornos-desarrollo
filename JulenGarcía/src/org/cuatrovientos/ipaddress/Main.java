package org.cuatrovientos.ipaddress;

import java.util.Random;
import java.util.Scanner;
/**
 * @author Julen
 * Simple menú to initialize an Array with IP adresses and a summary that counts what its the number with the IP adresses start
 */


public class Main {
	

	//public static void showArray (String[] ipAddresses) {}
	//public static String generateRandomIp() {}
	//public static void loadArray(String[] ipAddresses) {}
	//public static void summary(String[] ipAddresses) {}
	/**
	 * This method shows the menú to select the options.
	 */
	public static void showMenu() {
		System.out.println("Please select: ");
		System.out.println("1) Display array elements ");
		System.out.println("2) Display a randomly generated IP address ");
		System.out.println("3) Init array with random IP addresses ");
		System.out.println("4) Summary of array");
		System.out.println("5) Exit ");
		
	}
	/**
	 * This method shows the array IpAddresses[].
	 * @param ipAddresses
	 */
	public static void showArray (String[] ipAddresses) {
		System.out.println("Array is");
		for(int i =0; i < ipAddresses.length; i++) {
			System.out.println(i + 1 + ": " + ipAddresses[i]);
		}	
		
	}
	/**
	 * This method generates random IPS.
	 * @return
	 */
	
	public static String generateRandomIp() {
		Random random = new Random();
		String a = "";
		int number = 0;
		for (int i = 0; i < 3; i++) {
			number = random.nextInt(255);
		a = a + number + ".";
		}
		number = random.nextInt(255);
		a = a + number;
		
		return a;
		
	}
	/**
	 * This method loads the Array with the random IPS.
	 * @param ipAddresses
	 */
	
	public static void loadArray(String[] ipAddresses) {
		for (int i = 0; i < ipAddresses.length ; i++) {
			ipAddresses[i] = generateRandomIp();
		}		
	}
	/**
	 * This method say how many IPS that starts with 1, with 2 and with the rest of the numbers are currently in the array.
	 * @param ipAddresses
	 */
	
	public static void summary(String[] ipAddresses) {
		int one = 0;
		int two = 0;
		int rest = 0;
		String a = "";
		
		for (int i = 0; i < ipAddresses.length; i++) {
				a = ipAddresses[i];	
			if (a.startsWith("1")) {
				one = one + 1;
			} else {
				if (a.startsWith("2")) {
					two = two + 1;
				} else {
					rest = rest + 1;
				}
			}
		}
		System.out.println("There are " + one + " IP addresses that starts with 1, " + two + " IP addresses that starts with 2 and " + rest + " that start with the rest of the numbers.");
	}

	public static void main (String args[]) {
		String [] ipAddresses = new String[10];
		Scanner reader = new Scanner(System.in);
		String option = "";
	
		do {
			showMenu();
		option = reader.nextLine();
		
		switch (option) {
			case "1":
				System.out.println("You selected 1 ");
				showArray(ipAddresses);
				break;
			case "2":
				System.out.println("You selected 2 ");
				generateRandomIp();
				break;
			case "3":
				System.out.println("You selected 3 ");
				loadArray(ipAddresses);
				break;
			case "4":
				System.out.println("You selected 4 ");
				summary(ipAddresses);
				break;
			case "5":
				System.out.println("You selected 5 ");
				System.out.println("Byeeeeeeeeeee ");
				break;
			default:
				System.out.println("Incorrect option");
				break;
		}
		
		} while (!option.equals("5"));
	}


}
