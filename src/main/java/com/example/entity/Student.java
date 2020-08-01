package com.example.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<School> schools= new HashSet<>();

    public Student(final String name) {
        this.name = name;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Set<School> getSchools() {
        return schools;
    }

    public void setSchools(final Set<School> schools) {
        this.schools = schools;
    }

    public void addSchool( School school) {
        this.schools.add(school);
    }
}
