package com.mongoDb.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongoDb.blog.model.Comments;
import com.mongoDb.blog.repository.CommentsRepository;

@Service
public class CommentServiceImpl implements CommentsService{

	private CommentsRepository repository;

	@Override
	public List<Comments> findAll() {
		return repository.findAll();
}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
}

	@Override
	public Comments edit(Comments c) {
		return repository.save(c);
}

	@Override
	public Comments insert(Comments c) {
		return repository.insert(c);
}

}
