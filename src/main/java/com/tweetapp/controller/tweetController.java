package com.tweetapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetapp.modal.tweets;
import com.tweetapp.repository.tweetRepo;

@RestController
@RequestMapping("/tweets")
public class tweetController {
	@Autowired
	tweetRepo tweetRepo;
	 @PostMapping("/addtweet")
     public String savetweeets(@RequestBody tweets tweet) {
		tweetRepo.save(tweet);
		return "added tweets"+tweet.getId();
	 }
    
}
