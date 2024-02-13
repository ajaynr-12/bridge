package com.stayhub.bridge.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import com.stayhub.bridge.Model.ListingsAndReviews;
import com.stayhub.bridge.Services.ListingsAndReviewsService;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class ListingsAndReviewsController {
    @Autowired
    private ListingsAndReviewsService listingsAndReviewsService;


    public ListingsAndReviewsController(ListingsAndReviewsService listingsAndReviewsService) {
        this.listingsAndReviewsService = listingsAndReviewsService;
    }
    
    @QueryMapping
    public List<ListingsAndReviews> findAll() {
        return listingsAndReviewsService.findAll();
    }
    
    @QueryMapping
    public Optional<ListingsAndReviews> findById(@Argument String _id) {
        return listingsAndReviewsService.findById(_id);
    }

    @QueryMapping
    public List<ListingsAndReviews> getListingsAndReviewsWithLimitAndSkip(@Argument int limit, @Argument int offset) {
        return listingsAndReviewsService.getListingsAndReviewsWithLimitAndSkip(limit, offset);
    }
}
