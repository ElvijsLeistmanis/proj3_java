package service;

import model.Post;
import model.enums.PostType;

public interface Iposts {
	public void createPost(String inputMsg, PostType inputPostType);
}
