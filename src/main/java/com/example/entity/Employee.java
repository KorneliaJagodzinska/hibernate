package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "employee_table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(name = "password")
    String secret;
    @Column(length = 9, unique = true)
    String telephonenumber;
    @Transient
    Long age;
    @Temporal(value = TemporalType.DATE)
    Date birthday;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    String description;
    @Embedded
    Address address;

    public Employee(final String name, final String secret, final String telephonenumber, final Long age, final Date birthday, final Gender gender, final String description) {
        this.name = name;
        this.secret = secret;
        this.telephonenumber = telephonenumber;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.description = description;
    }

    public Employee(final String name, final String secret, final String telephonenumber, final Long age, final Date birthday, final Gender gender, final String description, final Address address) {
        this.name = name;
        this.secret = secret;
        this.telephonenumber = telephonenumber;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.description = description;
        this.address = address;
    }
}
