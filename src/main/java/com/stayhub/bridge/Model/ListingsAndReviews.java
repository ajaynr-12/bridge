package com.stayhub.bridge.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Data
@Document(collection = "listingsAndReviews")
@NoArgsConstructor
public class ListingsAndReviews {
    @Id
    private String _id;
    private String name;
    private String summary;
    private String house_rules;
    private String property_type;
    private String room_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;
    private int accommodates;
    private int bedrooms;
    private int beds;
    private int bathrooms;
    private int number_of_reviews;
    private int price;
    private int security_deposit;
    private int cleaning_fee;
    private Address address;
    private Images images;
    private ReviewScores review_scores;
    private List<Reviews> reviews;
}
