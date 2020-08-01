package com.example.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "schools")
    Set<Student> students= new HashSet<>();

    public School(final String name) {
        this.name = name;
    }

    public School() {
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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(final Set<Student> students) {
        this.students = students;
    }

    public void addstudent( Student student) {
        students.add(student);
        student.addSchool(this);

    }
}
