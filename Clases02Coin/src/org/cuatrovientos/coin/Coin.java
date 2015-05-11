/**
 * 
 */
package org.cuatrovientos.coin;

import java.util.Random;

/**
 * @author julen
 *
 */
public class Coin {
	/**
	 * 
	 */
	public Coin () {
		System.out.println("New instance of coin");
	}
	
	/**
	 * flips a coin
	 */
	
	public void flip () {
		Random random = new Random();
		int result = 0;
		
		result = random.nextInt(2);
		if (result == 0) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		for (int i = 0; i <10; i++) {
			myCoin.flip();
		}
		

	}

}
