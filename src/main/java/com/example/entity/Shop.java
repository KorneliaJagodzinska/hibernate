package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="shop")
@SecondaryTable(
        name="shop_address",
        pkJoinColumns = @PrimaryKeyJoinColumn(name="shop_id")
)
@Data
@NoArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Column(table="shop_address")
    String city;
    @Column(table = "shop_address")
    String street;

    public Shop(final String name, final String city, final String street) {
        this.name = name;
        this.city = city;
        this.street = street;
    }
}
