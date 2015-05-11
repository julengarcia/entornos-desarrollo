/**
 * 
 */
package org.cuatrovientos.legion;


import java.util.Enumeration;
import java.util.Vector;


/**
 * @author julen
 *
 */
public class Legion {
	private Vector<Legionaire> legionaires;
	
	public Legion () {
		legionaires = new Vector<Legionaire>();
		
	}
	/**
	 * 
	 * @param legionaire
	 */
	public void addLegionaire (Legionaire legionaire) {
		legionaires.add(legionaire);
	}
	/**
	 * 
	 * @param legionaire
	 */
	public void removeLegionaire (Legionaire legionaire) {
		legionaires.remove(legionaire);
	}
	
	public String showAll () {
		String result = "";
		
		for (Legionaire legionaire: legionaires) {
			result = result + legionaire.toString() + "\n";
		}
		return result;
		
	}
	
}
