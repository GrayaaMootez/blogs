package com.mongoDb.blog.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "comments")
public class Comments {

	@Field(value = "votes")
	private int votes;
	
	@Field(value = "text")
	private String text;
	
	@Field(value = "date_comm")
	private LocalDate date_comm;


	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate_comm() {
		return date_comm;
	}

	public void setDate_comm(LocalDate date_comm) {
		this.date_comm = date_comm;
	}

	@Override
	public String toString() {
		return "Comments [votes=" + votes + ", text=" + text + ", date_comm=" + date_comm + "]";
	}
	
	
	
}
