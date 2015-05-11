/**
 * 
 */
package org.cuatrovientos.hellokitty;

/**
 * @author julen
 *
 */
public class Candy extends Food {

	private int calories;
	
	/**
	 * @param name
	 * @param weight
	 */
	public Candy(String name, float weight) {
		super(name, weight);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Candy [calories=" + calories + ", toString()="
				+ super.toString() + "]";
	}

}
