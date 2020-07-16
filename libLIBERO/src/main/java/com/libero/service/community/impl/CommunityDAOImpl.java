package com.libero.service.community.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.libero.service.community.CommunityDAO;
import com.libero.service.domain.Post;

@Repository("communityDAOImpl")
public class CommunityDAOImpl implements CommunityDAO {

	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void SqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public CommunityDAOImpl() {
		System.out.println(this.getClass());
	}

	@Override
	public void addPost(Post post) throws Exception {
		//sqlSession.insert("CommunityMapper.addPost", post);

	}

	@Override
	public Post getPost(int postNo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("CommunityMapper.getPost", postNo);
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
