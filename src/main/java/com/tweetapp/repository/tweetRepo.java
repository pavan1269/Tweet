package com.tweetapp.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.modal.tweets;
@Repository
public interface tweetRepo extends MongoRepository<tweets,Integer>{

}
