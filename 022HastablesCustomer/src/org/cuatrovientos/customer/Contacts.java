/**
 * 
 */
package org.cuatrovientos.customer;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Represents the contacts
 * @author julen
 *
 */
public class Contacts {
	private String owner;
	private Hashtable<String,Customer> agenda;
	
	/**
	 * 
	 * @param owner
	 */
	
	public Contacts(String owner) {
		this.owner = owner;
		agenda = new Hashtable<String,Customer>();
	}
	
	/**
	 * add customer to our contacts
	 * @param customer
	 */
	
	public void addCustomer(Customer customer) {
		agenda.put(customer.getDni(), customer);
	}
	
	/**
	 * Search for a customer in our contacts
	 * @param Dni
	 * @return
	 */
	
	public Customer searchCustomer(String dni) {
		Customer customer = null;
		
		customer = agenda.get(dni);
		
		return customer;
	}
	
	/**
	 * remove the customer from our contacts
	 * @param plate
	 */
	
	public void removeCustomer(String dni) {
		agenda.remove(dni);
	}
	
	/**
	 * shows all customers in the Contacts
	 * @return
	 */
	public String showAll() {
		String allCustomers = "";
		
		// import java.util.Enumeration
		Enumeration<String> keys = agenda.keys();
		
		while (keys.hasMoreElements()) {
			String dni = keys.nextElement();
			allCustomers = allCustomers + agenda.get(dni).toString() + "\n";
		}
		
		return allCustomers;
	} 
}
