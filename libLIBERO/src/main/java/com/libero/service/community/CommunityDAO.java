package com.libero.service.community;

import com.libero.service.domain.Post;

public interface CommunityDAO {
	
	public void addPost(Post post) throws Exception;
	
	public Post getPost(int postNo) throws Exception;
	
	public void updatePost(Post post) throws Exception;
	
	public void deletePost(Post post) throws Exception;
	// list ³ªÁß¿¡ 
	
	
}
