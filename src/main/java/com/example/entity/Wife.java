package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne
    Husband husband;

    public Wife(final String name) {
        this.name = name;
    }
}

