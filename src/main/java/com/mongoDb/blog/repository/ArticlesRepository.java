package com.mongoDb.blog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongoDb.blog.model.Articles;
import com.mongoDb.blog.model.Users;

public interface ArticlesRepository extends MongoRepository<Articles, String> {

}
