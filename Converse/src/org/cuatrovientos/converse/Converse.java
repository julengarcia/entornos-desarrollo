/**
 * 
 */
package org.cuatrovientos.converse;

/**
 * @author julen
 *
 */
public class Converse {

	public double pesetasAEuros(double cantidad) {
		cantidad = cantidad * 0.006010113458;
		return cantidad;
		
	}
	public double eurosAPesetas(double cantidad) {
		cantidad = cantidad * 166.38621;
		return cantidad;
		
	}
	public double eurosADolares(double cantidad) {
		cantidad = cantidad * 1.2441;
		return cantidad;
		
	}
	public double dolaresAEuros(double cantidad) {
		cantidad = cantidad * 0.803793907;
		return cantidad;
		
	}
	public double eurosALibras(double cantidad) {
		cantidad = cantidad * 2.742771;
		return cantidad;
		
	}
	public double librasAEuros(double cantidad) {
		cantidad = cantidad * 0.364594783;
		return cantidad;
		
	}

}
