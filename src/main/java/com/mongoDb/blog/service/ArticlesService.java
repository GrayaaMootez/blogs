package com.mongoDb.blog.service;

import java.util.List;

import com.mongoDb.blog.model.Articles;

public interface ArticlesService {

	List<Articles> findAll();

	void delete(String id);

	Articles edit(Articles a);

	Articles insert(Articles a);

}
