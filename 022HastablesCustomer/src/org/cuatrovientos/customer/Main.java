/**
 * 
 */
package org.cuatrovientos.customer;


/**
 * @author julen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contacts contacts = new Contacts("Julen");
		Customer sampleCustomer = new Customer("123456789","Ivan","edfsg@hotmail.com");
		Customer otherSampleCustomer = new Customer("987654321","Asier","dsafa@hotmail.com");
		Customer anotherSampleCustomer = new Customer("147258369","Julen","dajshb@hotmail.com");
		
		
		// add customers to contacts
		contacts.addCustomer(sampleCustomer);
		contacts.addCustomer(otherSampleCustomer);
		contacts.addCustomer(anotherSampleCustomer);
		
		// show Contacts
		System.out.println("Contacts customers: " + contacts.showAll());
		
		// Search customer:
		Customer found = contacts.searchCustomer("123456789");
		if (null != found) {
			System.out.println("Customer found: " + found.toString());
		}
		
		// remove a customer:
		contacts.removeCustomer("123456789");
		
		System.out.println("\nShow contacts after removal:");
		// show contacts
		System.out.println("Contacts customers: " + contacts.showAll());

	}
}
