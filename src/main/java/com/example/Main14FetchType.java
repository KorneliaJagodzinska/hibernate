package com.example;

import com.example.entity.School;
import com.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main14FetchType {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        School school= session.find(School.class,1L );
        System.out.println(school.getName());

        school.getStudents().stream()
                .map(Student::getName)
                .forEach(System.out::println);



        transaction.commit();
        session.close();
    }
}
