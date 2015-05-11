/**
 * 
 */
package org.cuatrovientos.userlist.userlist;

import java.util.Vector;

/**
 * @author julen
 *
 */
public class UserList {
	Vector<User> list = new Vector<User>();
	
	public UserList () {
		list = new Vector<User>();
	}
	
	public void addUser(User user) {
		list.add(user);
	}
	
	public int userAt(User user) {
		
		return 0;	
	}
	
	public void deleteUser(User user) {
		
	}
}
