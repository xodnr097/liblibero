package com.libero.service.domain;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

@Data

public class Comment {
	
	private Post post;
	private User user;
	private int commentNo;
	private int parentCommentNo;
	private String commentContent;
	private Timestamp regDate;
	
	
	
}
