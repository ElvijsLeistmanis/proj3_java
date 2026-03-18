package model.users;

import java.util.ArrayList;

import model.Post;
import model.enums.PostType;

public class PrivateUser extends RegisteredUser{
	private ArrayList<Post> allPrivatePosts = new ArrayList<Post>();
	private ArrayList<Post> allPublicPosts = new ArrayList<Post>();
	private ArrayList<RegisteredUser> allFollowers = new ArrayList<RegisteredUser>();
	
	public ArrayList<Post> getAllPrivatePosts() {
		return allPrivatePosts;
	}

	public ArrayList<Post> getAllPublicPosts() {
		return allPublicPosts;
	}

	public ArrayList<RegisteredUser> getAllFollowers() {
		return allFollowers;
	}

	public PrivateUser() {
		super();
	}
	
	public PrivateUser(String username, String password, String title) {
		super(username, password, title);
	}
	
	public String toString() {
		return "Private user " + id + ": " + getUsername() + " " + getPassword() + " (" + getTitle() + ")" 
				+ " Posts:\n" + "->" 
				+ allPrivatePosts + "\n ->" 
				+ allPublicPosts + "\n ->" 
				+ allFollowers;
	}
	
	@Override
	public void createPost(String inputMsg, PostType inputPostType) {
		if (inputPostType.equals(PostType.privateType)) {
			allPrivatePosts.add(new Post(inputMsg));
		}
		else if (inputPostType.equals(PostType.publicType)) {
			allPublicPosts.add(new Post(inputMsg));
		}
	}
	
	public void followPrivateUser(RegisteredUser inputUser) {
		if (!allFollowers.contains(inputUser)) {
			allFollowers.add(inputUser);
		}
	}
}
