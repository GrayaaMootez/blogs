package com.mongoDb.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongoDb.blog.model.Users;
import com.mongoDb.blog.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersRepository usersRepository;

	@Override
	public List<Users> findAll() {
		return usersRepository.findAll();
}

	@Override
	public void delete(String id) {
		usersRepository.deleteById(id);
}

	@Override
	public Users edit(Users u) {
		return usersRepository.save(u);
}

	@Override
	public Users insert(Users u) {
		return usersRepository.insert(u);
}

}
