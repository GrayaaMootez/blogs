package com.mongoDb.blog.service;

import java.util.List;

import com.mongoDb.blog.model.Comments;

public interface CommentsService {

	List<Comments> findAll();

	void delete(String id);

	Comments edit(Comments c);

	Comments insert(Comments c);

}
