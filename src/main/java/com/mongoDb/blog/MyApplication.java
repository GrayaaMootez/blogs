package com.mongoDb.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongoDb.blog.model.Articles;
import com.mongoDb.blog.model.Users;
import com.mongoDb.blog.service.ArticlesService;
import com.mongoDb.blog.service.UsersService;

@SpringBootApplication
public class MyApplication implements CommandLineRunner {

	@Autowired
	UsersService service;
	
	@Autowired
	ArticlesService aservice;
	
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		for(Articles u:aservice.findAll())
		{
			System.out.print(u.getComments());

		}
		
	}

}