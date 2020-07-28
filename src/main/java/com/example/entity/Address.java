package com.example.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@Data
@Embeddable //obiekt wbudowany
public class Address {
    String city;
    String street;

    public Address(final String city, final String street) {
        this.city = city;
        this.street = street;
    }
}
