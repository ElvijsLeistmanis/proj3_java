package model.users;

import java.util.ArrayList;
import java.util.Arrays;

import model.Post;
import model.enums.PostType;

public class MainService {
	
	public static ArrayList<GuestUser> allUsers = new ArrayList<GuestUser>();
	
	public static void main(String[] args) {
		GuestUser user1 = new GuestUser();
		PrivateUser user2 = new PrivateUser("Lietot1", "12345", "SuperLietotajs");
		PrivateUser user3 = new PrivateUser("Lietot2", "54321", "MegaLietotajs");
		allUsers.addAll(Arrays.asList(user1, user2, user3));
		
		System.out.println(allUsers);
		System.out.println("-----------------------------------");
		user2.createPost("Hello There!", PostType.publicType);
		user3.createPost("How's it goin'", PostType.publicType);
		user2.createPost("This is a test message!", PostType.privateType);
		user3.createPost("I've come to make an announcement, Shadow the hedgehog is a bit-", PostType.privateType);
		
		user2.followPrivateUser(user3);
		
		System.out.println(allUsers);
	}

	public static ArrayList<GuestUser> getAllUsers() {
		return allUsers;
	}
}
