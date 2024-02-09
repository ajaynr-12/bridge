package com.stayhub.bridge.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stayhub.bridge.Model.ListingsAndReviews;

@Repository
public interface ListingsAndReviewsRepo extends MongoRepository<ListingsAndReviews, String>{
    
}
