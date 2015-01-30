package util;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDatabase {
	private ArrayList<User> users;

	public UserDatabase() {
		users = new ArrayList<User>();
	}

	// TODO: Finish
	public void createUser(String username, String password, String firstName, String lastName) {
		if(isValidUsername(username)) {
			if(isValidPassword(password)) {
				if(isValidName(firstName, lastName)) {
					
				}
			}
		}
	}
	
	/**
	 * Checks a regex expression against a string
	 */
	public boolean regexChecker(String regex, String text) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		return matcher.find();

	}

	public boolean isValidUsername(String username) {
		// Defines the regex pattern for a username
		String regex = "^(?=[^#%^&+\\/\\s]+$).{5,15}$";
		
		// Make sure the username is unique
		if (!(isUser(username))) {

			if(regexChecker(regex, username)) return true;
			else System.err.println("Error: Username must be in defined parameters!");
		}
		else System.err.println("Error: Username already exsits!");

		return false;
		
	}
	
	public boolean isValidPassword(String password) {
		// Defines the invalid chars for a password
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,20}$";
		
		if(regexChecker(regex, password)) return true;
		else System.err.println("Error: Password must be in defined parameters!");
		
		return false;
		
	}
	
	public boolean isValidName(String firstName, String lastName) {
		String regex = "^(?=[^a-z\\d\\s\\W]+$)(?=.*[A-Z]).{3,20}$";
		
		if(regexChecker(regex, firstName.toUpperCase()) && regexChecker(regex, lastName.toUpperCase())) return true;
		else System.err.println("Error: First and last name must be in defined parameters!");
		
		return false;
	}
	
	public boolean isUser(String username) {
		return users.contains(username);
	}
}
