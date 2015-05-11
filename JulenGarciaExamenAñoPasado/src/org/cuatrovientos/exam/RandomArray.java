package org.cuatrovientos.exam;

import java.util.Random;
import java.util.Scanner;
/**
 *@author Julen Garcia
 * Simple menu to initialize an array randomly and show the positive numbers
 */
public class RandomArray {
	
	//public static void showArray(int[] numbers);
	//public static void initRandom(int[] numbers);
	//public static int[] getPositives(int[] numbers);
	//public static void summary(int[] numbers);
	/**
	 * This method show the numbers of the Array
	 * @param numbers
	 */
	public static void showArray(int[] numbers) {
		System.out.println("Array is");
		for(int i =0; i < numbers.length; i++) {
			System.out.println(i + 1 + ": " + numbers[i]);
		}	
	}
	/**
	 * This method initializes the array with random numbers form -50 to 50
	 * @param numbers
	 */
	public static void initRandom(int[] numbers) {
		Random random = new Random();
		int a = 0;
		for (int i = 0; i < numbers.length; i++) {
			a = random.nextInt(100);
			a = a - 50;
			numbers[i] = a;
		}
	} 
	/**
	 * This method says the positive numbers
	 * @param numbers
	 * @return
	 */
	public static int[] getPositives(int[] numbers) {
		System.out.println("The array positive is ");
		int [] positiveNumbers = new int [10];
		int j = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positiveNumbers[j] = numbers[i];
				j = j + 1;
			}
		}
		return positiveNumbers;		
	}
	/**
	 * This method gives how many positives, 0 and negatives are in the array
	 * @param numbers
	 */
	public static void summary(int[] numbers) {
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				cont1 = cont1 + 1;
			} else {
				if (numbers[i] == 0) {
					cont2 = cont2 + 1;
				} else {
					cont3 = cont3 + 1;
			}
		}
	}
		System.out.println("There are " + cont1 + " positive numbers, " + cont2 + " cero numbers and  " + cont3 + " negative numbers.");
	}
	
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]) {
		int [] numbers = new int[10];
		String option = "";
		String line = "";
		Scanner reader = new Scanner(System.in);
		do {
			showMenu();
			
			option = reader.nextLine();
			
			switch (option) {
				case "1":
					System.out.println("You selected 1 ");
					showArray(numbers);
					break;
				case "2":
					System.out.println("You selected 2 ");
					initRandom(numbers);
					break;
				case "3":
					System.out.println("You selected 3 ");
					showArray(getPositives(numbers));
					break;
				case "4":
					System.out.println("You selected 4 ");
					summary(numbers);
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
	public static void showMenu() {
		System.out.println("Please select: ");
		System.out.println("1) Show elements of the array in the screen ");
		System.out.println("2) Initialize the array ");
		System.out.println("3) Show array of positives ");
		System.out.println("4) Show the type of the numbers (positive, negative or 0 )");
		System.out.println("5) Exit ");
		
	}


}
