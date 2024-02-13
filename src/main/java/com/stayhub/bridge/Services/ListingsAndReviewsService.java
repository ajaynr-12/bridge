package com.stayhub.bridge.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.stayhub.bridge.Model.Filter;
import com.stayhub.bridge.Model.ListingsAndReviews;
import com.stayhub.bridge.Repository.ListingsAndReviewsRepo;

@Service
public class ListingsAndReviewsService {
    @Autowired
    private ListingsAndReviewsRepo listingsAndReviewsRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<ListingsAndReviews> findAll() {
        return listingsAndReviewsRepo.findAll();
    }

    public List<ListingsAndReviews> getListingsAndReviewsWithLimitAndSkip(int limit, int offset) {
        Query query = new Query();
        query.limit(limit);
        query.skip(offset);
        return mongoTemplate.find(query, ListingsAndReviews.class);
    }

    public List<ListingsAndReviews> filterListingsAndReviews(Filter filter,int limit, int offset){
        Query query = new Query();
        query.addCriteria(
            new Criteria().orOperator(
                Criteria.where("price").gt(filter.getMinPrice()).lt(filter.getMaxPrice()),
                Criteria.where("address.country").is(filter.getCountry()),
                Criteria.where("bedrooms").is(filter.getBedrooms()),
                Criteria.where("beds").is(filter.getBeds()),
                Criteria.where("bathrooms").is(filter.getBathrooms()),
                Criteria.where("accommodates").is(filter.getAccommodates())
            )
        );
        query.limit(limit);
        query.skip(offset);
        return mongoTemplate.find(query, ListingsAndReviews.class);
    }

    public Optional<ListingsAndReviews> findById(String id) {
        return listingsAndReviewsRepo.findById(id);
    }
}
