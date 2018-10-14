package com.mongoDb.blog.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "articles")
public class Articles {
	@Id
	private String id;
	
	@Field(value = "title")
	private String title;
	
	@Field(value = "text")
	private String text;
	
	@Field(value = "date_art")
	private LocalDate date_artc;

	private List<Comments> comments;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public LocalDate getDate_artc() {
		return date_artc;
	}

	public void setDate_artc(LocalDate date_artc) {
		this.date_artc = date_artc;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Articles [id=" + id + ", title=" + title + ", text=" + text + ", date_artc=" + date_artc + "]";
	}

}
