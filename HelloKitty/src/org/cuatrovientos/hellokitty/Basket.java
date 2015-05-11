/**
 * 
 */
package org.cuatrovientos.hellokitty;

import java.util.Vector;

/**
 * @author julen
 *
 */
public class Basket {
	
	private Vector<Food> foods;
	
	/**
	 * default constructor
	 */
	public Basket() {
		foods = new Vector<Food>();
		
	}
	
	/**
	 * adds food into basket
	 * @param food
	 */
	public void addFood(Food food) {
		foods.add(food);
	}
	
	/**
	 * 
	 * @return total wight of food
	 */
	public float totalWeight () {
		float total = 0;
		
		for (int i = 0; i<foods.size();i++) {
			total = total + foods.elementAt(i).getWeight();
		}
		
		return total;
	}
	/**
	 * shows basket food
	 * @return basket contents
	 */
	public String toString () {
		String contents = "";
		
		// This is the other way to iterate a Vector
		for (Food food: foods) {
			contents = contents + food.toString() + "\n";
		}
		
		return contents;
	}
}
