package com.libero.service.community.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.libero.service.community.CommunityDAO;
import com.libero.service.community.CommunityService;
import com.libero.service.domain.Post;


@Service("communityServiceImpl")
public class CommunityServiceImpl implements CommunityService {
	
	@Autowired
	@Qualifier("communityDAOImpl")
	private CommunityDAO communityDAO;
	public void setCommunityDAO(CommunityDAO communityDAO) {
		this.communityDAO = communityDAO;
	}
	public CommunityServiceImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addPost(Post post) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Post getPost(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return communityDAO.getPost(postNo);
	}

	@Override
	public void updatePost(Post post) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePost(Post post) throws Exception {
		// TODO Auto-generated method stub

	}

}
