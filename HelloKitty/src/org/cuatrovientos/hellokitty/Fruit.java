/**
 * 
 */
package org.cuatrovientos.hellokitty;

/**
 * @author julen
 *
 */
public class Fruit extends Food {

	private String vitamin;
	
	/**
	 * constructor from superclass
	 * @param name
	 * @param weight
	 */
	
	public Fruit(String name, float weight) {
		super(name, weight);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fruit [vitamin=" + vitamin + ", toString()=" + super.toString()
				+ "]";
	}

}
