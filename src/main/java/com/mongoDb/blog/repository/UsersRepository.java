package com.mongoDb.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongoDb.blog.model.Users;


public interface UsersRepository  extends MongoRepository<Users, String> {
	
	

}
