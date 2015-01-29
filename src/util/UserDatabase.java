package util;

import java.util.ArrayList;

public class UserDatabase {
	private ArrayList<User> users;
	
	public UserDatabase() {
		users = new ArrayList<User>();
	}
	
	// TODO: Fix
	public boolean createUser(String username, String password, String firstName, String lastName) {
		return true;
	}
	
	public boolean isValidUsername(String username) {
		boolean valid = false;
		
		// Make sure the username is unique 
		if(!(isUser(username))) {
			
			// Is the username between 5-15 characters in length
			if(username.length() <= 15 && username.length() >= 5) {
				
				valid = true;
				
			}
			
		}
		
		return valid;
		
	}
	
	public boolean isUser(String username) {
		return users.contains(username);
	}
}
