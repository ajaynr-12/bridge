package com.stayhub.bridge.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stayhub.bridge.Model.ListingsAndReviews;
import com.stayhub.bridge.Repository.ListingsAndReviewsRepo;

@Service
public class ListingsAndReviewsService {
    @Autowired
    private ListingsAndReviewsRepo listingsAndReviewsRepo;

    public List<ListingsAndReviews> findAll() {
        return listingsAndReviewsRepo.findAll();
    }

    public Optional<ListingsAndReviews> findById(String id) {
        return listingsAndReviewsRepo.findById(id);
    }
}
