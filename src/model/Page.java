package model;

import java.util.ArrayList;

import model.users.RegisteredUser;

public class Page {
	private String title;
	private String description;
	private ArrayList<RegisteredUser> followersUsers = new ArrayList<RegisteredUser>();
	private ArrayList<Post> postsInPage = new ArrayList<Post>();
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public ArrayList<RegisteredUser> getFollowersUsers() {
		return followersUsers;
	}
	public ArrayList<Post> getPostsInPage() {
		return postsInPage;
	}
	
	public void setTitle(String title) {
		if(title != null && !title.isEmpty()) {
			this.title = title;
		}
		else {
			this.title = "Title";
		}
		
	}
	public void setDescription(String description) {
		if(description != null && !description.isEmpty()) {
			this.description = description;
		}
		else {
			this.description = "Description";
		}
	}
	
	public Page() {
		setTitle("Title");
		setDescription("Description");
	}
	
	public Page(String title, String description) {
		setTitle(title);
		setDescription(description);
	}

	public String toString() {
		return "Page " + title + " - " + description + "\nFollowers:" + followersUsers + "\nPosts:" + postsInPage;
	}
}
