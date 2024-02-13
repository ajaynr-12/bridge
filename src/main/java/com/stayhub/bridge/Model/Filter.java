package com.stayhub.bridge.Model;

import lombok.Data;

@Data
public class Filter {
    private int minPrice;
    private int maxPrice;
    private int bedrooms;
    private int bathrooms;
    private int beds;
    private int accommodates;
    private String country;
}
