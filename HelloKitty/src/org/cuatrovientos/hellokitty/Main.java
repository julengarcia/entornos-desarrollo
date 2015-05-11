package org.cuatrovientos.hellokitty;

import java.util.Vector;

/**
 * 
 * @author julen
 *
 */

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Basket myBasket = new Basket();
		
		Fruit oneFruit = new Fruit("Apple",4.2f);
		Candy sweet = new Candy("Bubblegum",100.5f);
		
		myBasket.addFood(oneFruit);
		myBasket.addFood(sweet);
		
		myBasket.addFood(new Fruit("Potato",266.6f));
		
		System.out.println("Total weight:");
		System.out.println(myBasket.totalWeight());
		
		System.out.println("Basket contents:");
		System.out.println(myBasket.toString());
	}

}
