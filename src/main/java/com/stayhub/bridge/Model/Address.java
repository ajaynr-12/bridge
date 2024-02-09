package com.stayhub.bridge.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address {
    private String street;
    private String suburb;
    private String government_area;
    private String market;
    private String country;
    private String country_code;
}
