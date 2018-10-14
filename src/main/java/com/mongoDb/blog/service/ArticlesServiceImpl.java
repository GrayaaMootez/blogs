package com.mongoDb.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongoDb.blog.model.Articles;
import com.mongoDb.blog.repository.ArticlesRepository;

@Service
public class ArticlesServiceImpl implements ArticlesService{

	@Autowired
	private ArticlesRepository repository;


	@Override
	public List<Articles> findAll() {
		return repository.findAll();
}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
}

	@Override
	public Articles edit(Articles a) {
		return repository.save(a);
}

	@Override
	public Articles insert(Articles a) {
		return repository.insert(a);
}
}
