package model.users;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import model.enums.PostType;
import service.Iposts;

public abstract class RegisteredUser extends GuestUser implements Iposts{
	//1.mainigie
	private String username;
	private String password;
	private String title;//privatajam lietoatajam vards un uzvards, biznesa leitajam- kompanijas nosaukums
	
	
	
	//2.getters
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getTitle() {
		return title;
	}
	
	//3.setters
	public void setUsername(String inputUsername) {
		if(inputUsername != null && !inputUsername.isEmpty() 
				&& inputUsername.matches("[A-Za-z0-9]{4,20}")) {
		username = inputUsername;
		}
		else
		{
			username = "DefaultUser";
		}
	}
	public void setPassword(String inputPassword) {
		
		if (inputPassword != null && !inputPassword.isEmpty()) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(inputPassword.getBytes());
			password = md.digest().toString();
		}
		catch (Exception e) {
			// TODO: handle exception
			}
		}
		else {
			password = "0000";
		}
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	//4.abi konstruktori
	public RegisteredUser() {
		super();
		username = "DefaultUser";
		password = "0000";
		title = "";
	}
	
	public RegisteredUser(String username, String password, String title) {
		super();
		setUsername(username);
		setPassword(password);
		setTitle(title);
	}
	
	//5.toString
	public String toString() {
		return "Registered user " + id + ": " + username + " " + password;
	}
	
	//6.parejas funkcijas
	
	public boolean login (String inputUsername, String inputPassword) throws NoSuchAlgorithmException {
		for(GuestUser tempUser : MainService.getAllUsers()) {
			if (tempUser instanceof RegisteredUser) {
				RegisteredUser tempRU = (RegisteredUser)tempUser;
				
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(inputPassword.getBytes());
				String inputPasswordEncoded = md.digest().toString();
				
				if(tempRU.getUsername().equals(inputUsername) && tempRU.getPassword().equals(inputPasswordEncoded)) {
					
				}
			}
		}
	}
}
