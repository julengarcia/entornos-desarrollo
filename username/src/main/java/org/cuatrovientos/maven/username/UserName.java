/**
 * 
 */
package org.cuatrovientos.maven.username;

/**
 * @author julen
 *
 */
public class UserName {
	private String name;
	private String surname;
	
	/**
	 * 
	 */
	public UserName () {
		name = "";
		surname = "";
	}
	
	/**
	 * 
	 * @param name
	 * @param surname
	 */
	public UserName(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	/**
	 * generates a username
	 * @return
	 */
	public String generate () {
		if (name.equals("") || surname.equals("")) {
			return "-empty";
		} else {
			return name.toLowerCase() + "_" + surname.toLowerCase();
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	
}
