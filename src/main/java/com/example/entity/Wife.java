package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Wife {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToOne(mappedBy = "wife")
    Husband husband;

    public Wife(final String name) {
        this.name = name;
    }

    public void setHusband(Husband husband){
        this.husband= husband;
        this.husband.setWife(this);
    }
}

