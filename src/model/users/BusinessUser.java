package model.users;

import java.util.ArrayList;

import model.Page;
import model.enums.PostType;

public class BusinessUser extends RegisteredUser{
	
	private ArrayList<Page> allPages = new ArrayList<Page>();
	
	public ArrayList<Page> getAllPages() {
		return allPages;
	}
	
	public BusinessUser() {
		setId();
		setUsername("ziedi");
		setPassword("1234");
	}
	
	public BusinessUser(String inputUsername, String inputPassword, String title) {
		super(inputUsername, inputPassword, title);
	}
	
	public String toString() {
		return super.toString() + "->" + allPages;
 	}
	
	@Override
	public void createPost(String inputMsg, PostType inputPostType) {
		// TODO Auto-generated method stub
		
	}

}
