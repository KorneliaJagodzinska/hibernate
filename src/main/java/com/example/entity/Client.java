package com.example.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    Set<Book> books= new HashSet<>();
}
