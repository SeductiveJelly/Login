package util;

import java.util.UUID;

public class User {
	private final String username, password, firstName, lastName;
	private final UUID id;
	private String displayName;
	
	protected User(String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		displayName = username;
		id = UUID.randomUUID();
		
	}
	
	protected void setDisplayName(String name) {
		displayName = name;
	}
}
