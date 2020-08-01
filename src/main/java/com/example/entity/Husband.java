package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
@NoArgsConstructor
@Data
@Entity
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne(cascade= CascadeType.ALL, orphanRemoval = true)
    Wife wife;

    public Husband(final String name) {
        this.name = name;
    }


}
