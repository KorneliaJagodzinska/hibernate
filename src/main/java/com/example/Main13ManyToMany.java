package com.example;

import com.example.entity.School;
import com.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main13ManyToMany {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        School school1= new School("school1");
        School school2= new School("school2");

        Student student1= new Student("student1");
        Student student2= new Student("student2");
        Student student3= new Student("student3");

        school1.addstudent(student1);
        school1.addstudent(student2);

        school2.addstudent(student2);
        school2.addstudent(student3);

        session.persist(school1);
        session.persist(school2);


        transaction.commit();
        session.close();
    }
}
