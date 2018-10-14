package com.mongoDb.blog.service;

import java.util.List;

import com.mongoDb.blog.model.Users;

public interface UsersService {

	List<Users> findAll();

	void delete(String id);

	Users edit(Users u);

	Users insert(Users u);



}
