package com.tweetapp.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="tweets")
public class tweets {
	@Id
 private int id;
 private String name;
 private String tweet;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTweet() {
	return tweet;
}
public void setTweet(String tweet) {
	this.tweet = tweet;
}
 
}
