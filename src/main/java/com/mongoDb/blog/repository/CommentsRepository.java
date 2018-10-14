package com.mongoDb.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongoDb.blog.model.Comments;
import com.mongoDb.blog.model.Users;

public interface CommentsRepository extends MongoRepository<Comments, String>{

}
